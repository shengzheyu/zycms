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

public class ChannelServlet extends BaseServlet {
	ChannelDao channelDao= new ChannelDao();
	//add
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		Channel channel =new Channel();
		channel.setId(request.getParameter("id"));
		channel.setChannelname(request.getParameter("channelname"));
		channel.setDescription(request.getParameter("description"));
		channelDao.save(channel);
		response.sendRedirect(request.getContextPath()+"/backend/channel/add_channel_success.jsp");
	}
	//show
	public void show(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
		String id=request.getParameter("id");
		Channel channel =channelDao.query_one(id);
		request.setAttribute("channel", channel);
		request.getRequestDispatcher("/backend/channel/show_channel.jsp").forward(request, response);
	}
	//update
	public void list_one(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String id=request.getParameter("id");
		Channel channel =channelDao.query_one(id);
		request.setAttribute("channel", channel);
		request.getRequestDispatcher("/backend/channel/change_list_channel.jsp").forward(request, response);
	}
	public void mod(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		Channel channel =new Channel();
		channel.setId(request.getParameter("id"));
		channel.setChannelname(request.getParameter("channelname"));
		channel.setDescription(request.getParameter("description"));
		channelDao.update(channel);
		this.list(request, response);
	}
	//É¾³ý
	public void del(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String id=request.getParameter("id");
		channelDao.delete(id);
		this.list(request, response);
	}
	//delbatch
	public void delBatch(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		if(request.getParameterValues("ids")!=null){
		String[] ids=request.getParameterValues("ids");
		
		for(int i=0;i<ids.length;i++){
			channelDao.delete(ids[i]);
			}
		}
		this.list(request, response);
	}
	//list
	public void list(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		PageModel pm=new PageModel();
		pm.setPageNo(1);
		pm.setPageSize(5);
		pm.setAllRecond(channelDao.query_count());
		if(request.getParameter("pageNo")!=null){
			pm.setPageNo(Integer.parseInt(request.getParameter("pageNo")));
		}
		if(request.getParameter("pageSize")!=null){
			pm.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
		List<Channel> channels=new ArrayList<Channel>();
		channels=channelDao.query(pm);
		request.setAttribute("channels", channels);
		request.setAttribute("pm", pm);
		request.getRequestDispatcher("/backend/channel/list_channel.jsp").forward(request, response);
	}
}

