package cn.edu.sjzc.cms.service;

import java.sql.SQLException;

import cn.edu.sjzc.cms.dao.AdminDao;
import cn.edu.sjzc.cms.model.Admin;

/**
 * 
 * <p>Description: ��һ��Admin�ĵ�¼��֤<p>
 * @author ZY
 * @date ����3:46:15
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
