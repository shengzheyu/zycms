package cn.edu.sjzc.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.edu.sjzc.cms.model.Admin;
import cn.edu.sjzc.cms.model.User;
import cn.edu.sjzc.cms.utils.DB;
import cn.itcast.jdbc.TxQueryRunner;



public class AdminDao {
	private QueryRunner qr = new TxQueryRunner();
	/**
	 * 通过管理员登录名和登录密码查询
	 * @param adminname
	 * @param adminpwd
	 * @return
	 * @throws SQLException
	 */
	public Admin find(String adminname, String password) throws SQLException {
		String sql = "select * from t_admin where adminname=? and password=?";
		return qr.query(sql, new BeanHandler<Admin>(Admin.class), adminname, password);
	}
}
