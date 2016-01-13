package cn.edu.sjzc.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.edu.sjzc.cms.model.Massage;
import cn.edu.sjzc.cms.model.PageModel;
import cn.edu.sjzc.cms.utils.DB;

public class MassageDao {
	public void save(Massage massage) {
		String sql= "insert into t_massage(publisher,content,article_id) values(?,?,?)";
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, massage.getPublisher());
			pstmt.setString(2, massage.getContent());
			pstmt.setInt(3,massage.getArticleId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		
	}
	public List<Massage> query(int id,PageModel pm) {
		String sql= "select * from t_massage where article_id = ? limit ?,?";
		List<Massage> massages=new ArrayList<Massage>();
		Connection conn=DB.getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.setInt(2,pm.getStartIndex());
			pstmt.setInt(3,5);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Massage massage=new Massage();
				massage.setPublisher(rs.getString("publisher"));
				massage.setContent(rs.getString("content"));
				massage.setArticleId(rs.getInt("article_id"));
				massages.add(massage);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DB.close(conn);
		}
		return massages;
	}
	public int query_count() {
		String sql= "select count(*) from t_massage";
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
}
