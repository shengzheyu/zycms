package cn.edu.sjzc.cms.servlet.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.cms.dao.UserDao;
import cn.edu.sjzc.cms.model.User;
import cn.itcast.commons.CommonUtils;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String checkcode=request.getParameter("checkcode");
		//封装表单数据到admin
		//User form = CommonUtils.toBean(request.getParameterMap(), User.class);
		UserDao userDao=new UserDao();
		boolean flag=false;
		if(!(checkcode.equals((String)request.getSession().getAttribute("CHECK_CODE")))){
				request.setAttribute("error","验证码出错");
		}else{
			flag=true;
		}
		if(flag){
			try {
				flag=userDao.login(username, password);
			} catch (RuntimeException re) {
				request.setAttribute("error", re.getMessage());
			}
		}
		if(flag){
			request.getSession().setAttribute("LOGIN_USER", username);
			request.getRequestDispatcher("/backend/main.jsp").forward(request,response);
		}else{
			request.getRequestDispatcher("/backend/login.jsp").forward(request,response);
		}
	}

}
