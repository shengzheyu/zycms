package cn.edu.sjzc.cms.service;

import java.sql.SQLException;

import cn.edu.sjzc.cms.dao.AdminDao;
import cn.edu.sjzc.cms.model.Admin;

/**
 * 
 * <p>Description: 做一个Admin的登录验证<p>
 * @author ZY
 * @date 下午3:46:15
 *
 */
public class AdminService {

	private AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin) {
		try {
			return adminDao.find(admin.getAdminname(), admin.getPassword());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
