package cn.edu.sjzc.cms.servlet.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends BaseServlet {
	
	/**
	 * ajax��֤���Ƿ���ȷУ��
	 * @param req
	 * @param resp
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String ajaxValidateVerifyCode(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*
		 * 1. ��ȡ������е���֤��
		 */
		String verifyCode = req.getParameter("verifyCode");
		/*
		 * 2. ��ȡͼƬ����ʵ��У����
		 */
		String vcode = (String) req.getSession().getAttribute("vCode");
		/*
		 * 3. ���к��Դ�Сд�Ƚϣ��õ����
		 */
		boolean b = verifyCode.equalsIgnoreCase(vcode);
		/*
		 * 4. ���͸��ͻ���
		 */
		resp.getWriter().print(b);
		return null;
	}


}
