package cn.edu.sjzc.cms.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;



public class DBTest {
	@Test
	public void test01(){
		Connection conn = DB.getConn();
		
		String sql = "insert into t_user(username,password) values ('xujia','xujia')";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test02(){
		for(int i=1;i<21;i++){
		String sql= "insert into t_article(title,source,author,content,create_time,channel_id,is_header_line,is_recommend,click_score,msg_count) values(?,?,?,?,now(),?,?,?,0,0)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "流行歌曲"+i);
			pstmt.setString(2,"baidu"+i);
			pstmt.setString(3, "浩"+i);
			pstmt.setString(4,"突然好想你，你会在哪里。过的快乐或委屈");
			pstmt.setString(5,"1");
			pstmt.setString(6,"0");
			pstmt.setString(7,"0");
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		}
	for(int i=1;i<21;i++){
		String sql= "insert into t_article(title,source,author,content,create_time,channel_id,is_header_line,is_recommend,click_score,msg_count) values(?,?,?,?,now(),?,?,?,0,0)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "好看电影"+i);
			pstmt.setString(2,"baidu"+i);
			pstmt.setString(3, "浩"+i);
			pstmt.setString(4,"生化危机系列···等等");
			pstmt.setString(5,"2");
			pstmt.setString(6,"0");
			pstmt.setString(7,"0");
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		}
	for(int i=1;i<21;i++){
		String sql= "insert into t_article(title,source,author,content,create_time,channel_id,is_header_line,is_recommend,click_score,msg_count) values(?,?,?,?,now(),?,?,?,0,0)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "古典文学"+i);
			pstmt.setString(2,"baidu"+i);
			pstmt.setString(3, "浩"+i);
			pstmt.setString(4,"突然·······乐或委屈");
			pstmt.setString(5,"3");
			pstmt.setString(6,"0");
			pstmt.setString(7,"0");
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		}
	for(int i=1;i<21;i++){
		String sql= "insert into t_article(title,source,author,content,create_time,channel_id,is_header_line,is_recommend,click_score,msg_count) values(?,?,?,?,now(),?,?,?,0,0)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "java"+i);
			pstmt.setString(2,"baidu"+i);
			pstmt.setString(3, "浩"+i);
			pstmt.setString(4,"public static void main");
			pstmt.setString(5,"4");
			pstmt.setString(6,"0");
			pstmt.setString(7,"0");
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
}
