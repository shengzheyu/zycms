package cn.edu.sjzc.cms.servlet.site;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.cms.dao.MassageDao;
import cn.edu.sjzc.cms.model.Massage;
import cn.edu.sjzc.cms.model.PageModel;
import cn.edu.sjzc.cms.servlet.backend.BaseServlet;

public class MassageServlet extends BaseServlet {
	private MassageDao massageDao=new MassageDao();
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String publisher= request.getParameter("publisher");
		String content= request.getParameter("content");
		int articleId=Integer.parseInt(request.getParameter("articleId"));
		Massage massage=new Massage();
		massage.setPublisher(publisher);
		massage.setContent(content);
		massage.setArticleId(articleId);
		massageDao.save(massage);
		response.sendRedirect(request.getContextPath()+"/article.jsp?articleId="+articleId);
	}
//	public void list(HttpServletRequest request, HttpServletResponse response)
//	throws ServletException, IOException {
//		PageModel mpm=new PageModel();
//		System.out.println(massageDao.query_count());
//		mpm.setAllRecond(massageDao.query_count());
//		if(request.getParameter("mpageNo")!=null){
//			mpageNo = Integer.parseInt(request.getParameter("mpageNo"));
//		}
//		if(request.getParameter("mpageSize")!=null){
//			mpageSize= Integer.parseInt(request.getParameter("mpageSize"));
//		}
//		mpm.setPageNo(mpageNo);
//		mpm.setPageSize(mpageSize);
//		
//		request.setAttribute("mpm", mpm);
//		List<Massage> massages= new ArrayList<Massage>();
//		massages=massageDao.query();
//		request.setAttribute("massages",massages);
//		request.getRequestDispatcher("/site/article_content.jsp").forward(request, response);
//	}
}


