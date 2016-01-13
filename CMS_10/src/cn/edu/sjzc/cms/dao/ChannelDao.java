package cn.edu.sjzc.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.sjzc.cms.model.Channel;
import cn.edu.sjzc.cms.model.PageModel;
import cn.edu.sjzc.cms.utils.DB;

public class ChannelDao {

	public void save(Channel channel) {
		String sql= "insert into t_channel(id,channelname,description) values(?,?,?)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, channel.getId());
			pstmt.setString(2, channel.getChannelname());
			pstmt.setString(3, channel.getDescription());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
	public void update(Channel channel) {
		String sql= "update t_channel set channelname=?,description=? where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, channel.getChannelname());
			pstmt.setString(2, channel.getDescription());
			pstmt.setString(3, channel.getId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}		
	}
	public Channel query_one(String id) {
		String sql= "select * from t_channel where id=?";
		Connection conn=DB.getConn();
		Channel channel= new Channel();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
			channel.setId(rs.getString("id"));
			channel.setChannelname(rs.getString("channelname"));
			channel.setDescription(rs.getString("description"));
			}
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return channel;
	}
	public void delete(String id) {
		String sql= "delete from t_channel where id=?";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
	public List<Channel> query() {
		String sql= "select * from t_channel";
		List<Channel> channels=new ArrayList<Channel>();
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Channel channel=new Channel();
				channel.setId(rs.getString("id"));
				channel.setChannelname(rs.getString("channelname"));
				channel.setDescription(rs.getString("description"));
				channels.add(channel);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return channels;
	}
	public int query_count() {
		String sql= "select count(*) from t_channel";
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
	public List<Channel> query(PageModel pm) {
		String sql= "select * from t_channel limit ?,?";
		List<Channel> channels=new ArrayList<Channel>();
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,pm.getStartIndex());
			pstmt.setInt(2,pm.getPageSize());
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Channel channel=new Channel();
				channel.setId(rs.getString("id"));
				channel.setChannelname(rs.getString("channelname"));
				channel.setDescription(rs.getString("description"));
				channels.add(channel);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return channels;
	}
}
