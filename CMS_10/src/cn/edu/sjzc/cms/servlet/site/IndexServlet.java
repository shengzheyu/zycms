package cn.edu.sjzc.cms.servlet.site;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.cms.dao.ArticleDao;
import cn.edu.sjzc.cms.dao.ChannelDao;
import cn.edu.sjzc.cms.dao.MassageDao;
import cn.edu.sjzc.cms.model.Article;
import cn.edu.sjzc.cms.model.Channel;
import cn.edu.sjzc.cms.model.Massage;
import cn.edu.sjzc.cms.model.PageModel;
import cn.edu.sjzc.cms.servlet.backend.BaseServlet;

public class IndexServlet extends BaseServlet {
	private ChannelDao channelDao=new ChannelDao();
	private ArticleDao articleDao=new ArticleDao(); 
	private MassageDao massageDao=new MassageDao();
	public void nav(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Channel> channels=new ArrayList<Channel>();
		
		channels=channelDao.query();
		request.setAttribute("channels",channels);
		request.getRequestDispatcher("/site/nav.jsp").include(request, response);
	}
	public void channelIndex(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Article> articles=new ArrayList<Article>();
		String channelId=request.getParameter("channelId");
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		pm.setPageSize(10);
		articles=(List<Article>)articleDao.query(channelId, false, false, false,pm);
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/site/channelIndex.jsp").include(request, response);
	}
	public void topic_left(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Article> articles=new ArrayList<Article>();
		String channelId=request.getParameter("channelId");
		request.setAttribute("channel",channelDao.query_one(channelId));
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		articles=(List<Article>)articleDao.query(channelId, false, false, false,pm);
		request.setAttribute("pm",pm);
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/site/topic_left.jsp").include(request, response);
	}
	public void article(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("articleId"));
		articleDao.updateClickScore(id);
		Article article=articleDao.get(id);
		request.setAttribute("article", article);
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		pm.setAllRecond(massageDao.query_count());
		request.setAttribute("pm", pm);
		List<Massage> massages= new ArrayList<Massage>();
		massages=massageDao.query(id,pm);
		request.setAttribute("massages",massages);
		request.getRequestDispatcher("/site/article_content.jsp").include(request, response);
	}
	public void headline(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Article> articles=new ArrayList<Article>();
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		articles=(List<Article>)articleDao.query("", true, false, false,pm);
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/site/headline.jsp").include(request, response);
	}
	public void recommend(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Article> articles=new ArrayList<Article>();
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		pm.setPageNo(1);
		articles=(List<Article>)articleDao.query("", true, true, false,pm);
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/site/recommend.jsp").include(request, response);
	}
	public void latest(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Article> articles=new ArrayList<Article>();
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		articles=(List<Article>)articleDao.query("", true, false, true,pm);
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/site/latest.jsp").include(request, response);
	}
	public void etc(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Article> articles=new ArrayList<Article>();
		PageModel pm=new PageModel();
		pm=this.getPageInfo(request);
		articles=(List<Article>)articleDao.qurey_like("java");
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/site/etc.jsp").include(request, response);
	}
	public void like(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
		if(request.getParameter("purpose")!=null){
		String purpose=request.getParameter("purpose");
		ArticleDao articleDao=new ArticleDao();
		List<Article> articles=(List<Article>)articleDao.qurey_like(purpose);	
		String id=articles.get(0).getChannel().getId();
		response.sendRedirect(request.getContextPath()+"/topic.jsp?channelId="+id);
		}else{
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	}
	public PageModel getPageInfo(HttpServletRequest request){
		PageModel pm=new PageModel();
		String channelId="";
		if(request.getParameter("channelId")!=null){
			channelId=request.getParameter("channelId");	
		}
		pm.setPageNo(1);
		pm.setPageSize(5);
		pm.setAllRecond(articleDao.query_count(channelId, false, false, false));
		if(request.getParameter("pageNo")!=null){
			pm.setPageNo(Integer.parseInt(request.getParameter("pageNo")));
		}
		if(request.getParameter("pageSize")!=null){
			pm.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
		return pm;
	}
}
