package cn.edu.sjzc.cms.servlet.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.cms.model.Admin;
import cn.edu.sjzc.cms.service.AdminService;
import cn.itcast.commons.CommonUtils;

public class AdminServlet extends BaseServlet {
	
	private AdminService adminService = new AdminService();

	public String Login(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		/*
		 * 1. 封装表单数据到Admin
		 */
		Admin form = CommonUtils.toBean(req.getParameterMap(), Admin.class);
		Admin admin = adminService.login(form);
		if(admin == null) {
			req.setAttribute("msg", "用户名或密码错误！");
			return "/backend/login.jsp";
		}
		req.getSession().setAttribute("admin", admin);
		return "r:/backend/main.jsp";
	}

}
