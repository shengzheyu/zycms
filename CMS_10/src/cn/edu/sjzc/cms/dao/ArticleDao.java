package cn.edu.sjzc.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import cn.edu.sjzc.cms.model.Article;
import cn.edu.sjzc.cms.model.Channel;
import cn.edu.sjzc.cms.model.PageModel;
import cn.edu.sjzc.cms.utils.DB;

public class ArticleDao {
	public void save(Article article) {
		String sql= "insert into t_article(title,source,author,content,create_time,channel_id,is_header_line,is_recommend,click_score,msg_count) values(?,?,?,?,now(),?,?,?,0,0)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2,article.getSource());
			pstmt.setString(3, article.getAuthor());
			pstmt.setString(4,article.getContent());
			pstmt.setString(5,article.getChannel().getId());
			pstmt.setString(6,article.isIs_header_line()?"1":"0");
			pstmt.setString(7,article.isIs_recommend()?"1":"0");
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
	public void update(Article article) {
		String sql= "update t_article set title=?,author=?,source=?,content=?,is_header_line=?,is_recommend=?,update_time=now(),channel_id=? where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,article.getTitle());
			pstmt.setString(2,article.getAuthor());
			pstmt.setString(3,article.getSource());
			pstmt.setString(4,article.getContent());
			pstmt.setString(5,article.isIs_header_line()?"1":"0");
			pstmt.setString(6,article.isIs_recommend()?"1":"0");
			pstmt.setString(7, article.getChannel().getId());
			pstmt.setInt(8,article.getId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}		
	}
	public Article get(int id) {
		Article article= new Article();
		String sql= "select * from t_article where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				article.setAuthor(rs.getString("author"));
				ChannelDao channelDao=new ChannelDao();
				Channel channel=channelDao.query_one(rs.getString("channel_id"));
				article.setId(rs.getInt("id"));
				article.setChannel(channel);
				article.setTitle(rs.getString("title"));
				article.setSource(rs.getString("source"));
				article.setContent(rs.getString("content"));
				article.setIs_header_line(rs.getString("is_header_line").equals("1")?true:false);
				article.setIs_recommend(rs.getString("is_recommend").equals("1")?true:false);
				article.setCreate_time(rs.getDate("create_time"));
				article.setUpdate_time(rs.getDate("update_time"));
				article.setPublish_time(rs.getDate("publish_time"));
				article.setClick_score(rs.getInt("click_score"));
				article.setMsg_count(rs.getInt("msg_count"));
			}
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return article;
	}
	public void delete(int id) {
		String sql= "delete from t_article where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
	public void updateClickScore(int id) {
		String sql= "update t_article set click_score=click_score+1 where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
	public List<Article> query() {
		String sql= "select * from t_article";
		List<Article> articles=new ArrayList<Article>();
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Article article= new Article();
				article.setAuthor(rs.getString("author"));
				ChannelDao channelDao=new ChannelDao();
				Channel channel=channelDao.query_one(rs.getString("channel_id"));
				article.setId(rs.getInt("id"));
				article.setChannel(channel);
				article.setTitle(rs.getString("title"));
				article.setSource(rs.getString("source"));
				article.setContent(rs.getString("content"));
				article.setIs_header_line(rs.getString("is_header_line").equals("1")?true:false);
				article.setIs_recommend(rs.getString("is_recommend").equals("1")?true:false);
				article.setCreate_time(rs.getDate("create_time"));
				article.setUpdate_time(rs.getDate("update_time"));
				article.setPublish_time(rs.getDate("publish_time"));
				article.setClick_score(rs.getInt("click_score"));
				article.setMsg_count(rs.getInt("msg_count"));
				articles.add(article);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return articles;
	}
	public int query_count() {
		String sql= "select count(*) from t_article";
		int allRecond = 0;
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()){
			allRecond=rs.getInt(1);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return allRecond;
	}
	
	public List<Article> query(PageModel pm) {
		String sql= "select * from t_article limit ?,?";
		List<Article> articles=new ArrayList<Article>();
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,pm.getStartIndex());
			pstmt.setInt(2,pm.getPageSize());
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Article article= new Article();
				article.setAuthor(rs.getString("author"));
				ChannelDao channelDao=new ChannelDao();
				Channel channel=channelDao.query_one(rs.getString("channel_id"));
				article.setId(rs.getInt("id"));
				article.setChannel(channel);
				article.setTitle(rs.getString("title"));
				article.setSource(rs.getString("source"));
				article.setContent(rs.getString("content"));
				article.setIs_header_line(rs.getString("is_header_line").equals("1")?true:false);
				article.setIs_recommend(rs.getString("is_recommend").equals("1")?true:false);
				article.setCreate_time(rs.getDate("create_time"));
				article.setUpdate_time(rs.getDate("update_time"));
				article.setPublish_time(rs.getDate("publish_time"));
				article.setClick_score(rs.getInt("click_score"));
				article.setMsg_count(rs.getInt("msg_count"));
				articles.add(article);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return articles;
	}
	public List<Article> qurey_like(String purpose) {
		String sql= "select * from t_article where title like ?";
		List<Article> articles=new ArrayList<Article>();
		
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%"+purpose+"%");
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Article article=new Article();
				article.setAuthor(rs.getString("author"));
				ChannelDao channelDao=new ChannelDao();
				Channel channel=channelDao.query_one(rs.getString("channel_id"));
				article.setId(rs.getInt("id"));
				article.setChannel(channel);
				article.setTitle(rs.getString("title"));
				article.setSource(rs.getString("source"));
				article.setContent(rs.getString("content"));
				article.setIs_header_line(rs.getString("is_header_line").equals("1")?true:false);
				article.setIs_recommend(rs.getString("is_recommend").equals("1")?true:false);
				article.setCreate_time(rs.getDate("create_time"));
				article.setUpdate_time(rs.getDate("update_time"));
				article.setPublish_time(rs.getDate("publish_time"));
				article.setClick_score(rs.getInt("click_score"));
				article.setMsg_count(rs.getInt("msg_count"));
				articles.add(article);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return articles;
	}
	public List<Article> query(String channel_id,boolean isHeaderLine,boolean isCommend,boolean islatest, PageModel pm) {
		String sql= "select * from t_article where publish_time is not null ";
		if(channel_id!=""){
			sql+="and channel_id=?";
		}
		if(isHeaderLine){
			sql+="and is_header_line='1'";
		}
		if(isCommend){
			sql+="and is_recommend='1'";
		}
		if(islatest){
			sql+="order by publish_time desc";
		}
		sql+=" limit ?,?";
		List<Article> articles=new ArrayList<Article>();
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if(!channel_id.equals("")){
				pstmt.setString(1,channel_id);
				pstmt.setInt(2,pm.getStartIndex());
				pstmt.setInt(3,pm.getPageSize());
			}else{
				pstmt.setInt(1,pm.getStartIndex());
				pstmt.setInt(2,pm.getPageSize());
			}
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Article article= new Article();
				article.setAuthor(rs.getString("author"));
				ChannelDao channelDao=new ChannelDao();
				Channel channel=channelDao.query_one(rs.getString("channel_id"));
				article.setId(rs.getInt("id"));
				article.setChannel(channel);
				article.setTitle(rs.getString("title"));
				article.setSource(rs.getString("source"));
				article.setContent(rs.getString("content"));
				article.setCreate_time(rs.getDate("create_time"));
				article.setUpdate_time(rs.getDate("update_time"));
				article.setPublish_time(rs.getDate("publish_time"));
				article.setClick_score(rs.getInt("click_score"));
				article.setMsg_count(rs.getInt("msg_count"));
				articles.add(article);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return articles;
	}
	public int query_count(String channel_id,boolean isHeaderLine,boolean isCommend,boolean islatest) {
		String sql= "select count(*) from t_article where publish_time is not null";
		if(channel_id!=""){
			sql+=" and channel_id=?";
		}
		if(isHeaderLine){
			sql+=" and is_header_line='1'";
		}
		if(isCommend){
			sql+=" and is_recommend='1'";
		}
		if(islatest){
			sql+=" order by publish_time desc";
		}
		int allRecond = 0;
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if(!channel_id.equals("")){
				pstmt.setString(1,channel_id);
			}
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()){
			allRecond=rs.getInt(1);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return allRecond;
	}
	public void publish(int id) {
		String sql= "update t_article set publish_time=now() where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
}
