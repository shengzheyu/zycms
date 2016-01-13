package cn.edu.sjzc.cms.servlet.backend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.sjzc.cms.dao.ArticleDao;
import cn.edu.sjzc.cms.dao.ChannelDao;
import cn.edu.sjzc.cms.model.Article;
import cn.edu.sjzc.cms.model.Channel;
import cn.edu.sjzc.cms.model.PageModel;
import cn.edu.sjzc.cms.utils.DB;



public class ArticleServlet extends BaseServlet {
	private ChannelDao channelDao= new ChannelDao();
	private ArticleDao articleDao =new ArticleDao();
	int pageNo=1;
	int pageSize=5;
	//add
	public void addinput(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		List<Channel> channels =(List<Channel>) channelDao.query();
		request.setAttribute("channels", channels);
		request.getRequestDispatcher("/backend/article/add_article.jsp").forward(request, response);
	}
	public void publish(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		articleDao.publish(id);
		this.list(request, response);
	}
	public void publishBatch(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ArticleDao articleDao =new ArticleDao();
		String[] idss=request.getParameterValues("ids");
		for(int i=0;i<idss.length;i++){
			int id=Integer.parseInt(idss[i]);
			articleDao.publish(id);
		}
		this.list(request, response);
	}
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		Channel channel=new Channel();
		channel=channelDao.query_one(request.getParameter("channelId"));
		Article article = new Article();
		article.setChannel(channel);
		article.setTitle(request.getParameter("title"));
		article.setAuthor(request.getParameter("author"));
		article.setSource(request.getParameter("source"));
		article.setContent(request.getParameter("content"));
		String ihl=request.getParameter("headerline");
		String rcd=request.getParameter("recommend");
		boolean isHeaderLine=false;
		if("1".equals(ihl)){
			isHeaderLine=true;
		}
		article.setIs_header_line(isHeaderLine);
		
		boolean recommend=false;
		if("1".equals(rcd)){
			recommend=true;
		}
		article.setIs_recommend(recommend);
		ArticleDao articleDao = new ArticleDao();
		articleDao.save(article);
		response.sendRedirect(request.getContextPath()+"/backend/article/add_article_success.jsp");
		
	}
	public void list(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		PageModel pm=new PageModel();
		
		pm.setAllRecond(articleDao.query_count());
		if(request.getParameter("pageNo")!=null){
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
		}
		if(request.getParameter("pageSize")!=null){
			pageSize= Integer.parseInt(request.getParameter("pageSize"));
		}
		pm.setPageNo(pageNo);
		pm.setPageSize(pageSize);
		
		request.setAttribute("pm", pm);
		List<Article> articles=new ArrayList<Article>();
		articles=articleDao.query(pm);
		request.setAttribute("articles", articles);
		request.getRequestDispatcher("/backend/article/list_article.jsp").forward(request, response);
	}
	
	public void del(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ArticleDao articleDao =new ArticleDao();
		int id=Integer.parseInt(request.getParameter("id"));
		articleDao.delete(id);
		this.list(request, response);
	}
	public void delBatch(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ArticleDao articleDao =new ArticleDao();
		String[] idss=request.getParameterValues("ids");
		for(int i=0;i<idss.length;i++){
			int id=Integer.parseInt(idss[i]);
			articleDao.delete(id);
		}
		this.list(request, response);
	}
	public void mod(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ArticleDao articleDao =new ArticleDao();
		int id=Integer.parseInt(request.getParameter("id"));
		Article article=articleDao.get(id);
		List<Channel> channels =(List<Channel>) channelDao.query();
		request.setAttribute("channels", channels);
		request.setAttribute("article", article);
		request.getRequestDispatcher("/backend/article/update_article.jsp").forward(request, response);
	}
	public void modify(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		ArticleDao articleDao=new ArticleDao();
		Channel channel=new Channel();
		channel=channelDao.query_one(request.getParameter("channelId"));
		Article article = new Article();
		article.setChannel(channel);
		article.setId(Integer.parseInt(request.getParameter("id")));
		article.setTitle(request.getParameter("title"));
		article.setAuthor(request.getParameter("author"));
		article.setSource(request.getParameter("source"));
		article.setContent(request.getParameter("content"));
		String ihl=request.getParameter("headerline");
		String rcd=request.getParameter("recommend");
		boolean isHeaderLine=false;
		if("1".equals(ihl)){
			isHeaderLine=true;
		}
		article.setIs_header_line(isHeaderLine);
		
		boolean recommend=false;
		if("1".equals(rcd)){
			recommend=true;
		}
		article.setIs_recommend(recommend);
		articleDao.update(article);
		this.list(request, response);
	}
	public void show(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		ArticleDao articleDao=new ArticleDao();
		Article article=articleDao.get(id);
		request.setAttribute("article", article);
		request.getRequestDispatcher("/backend/article/show_article.jsp").forward(request, response);
	}

}
