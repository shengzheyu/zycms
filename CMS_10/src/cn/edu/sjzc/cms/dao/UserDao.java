package cn.edu.sjzc.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.sjzc.cms.model.User;
import cn.edu.sjzc.cms.utils.DB;



public class UserDao {
	public boolean login(String username,String password){
		User user=getUserByUsername(username);
			if(user==null){
				throw new RuntimeException("用户名不存在");
				
			}
			if(user!=null && !password.equals(user.getPassword())){
				throw new RuntimeException("密码不正确");
			}
		return true;
	}
	
	public User getUserByUsername(String username){
		String sql="select * from t_user where username=?";
		Connection conn=DB.getConn();
		try {
			
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
		
	
	}

}
