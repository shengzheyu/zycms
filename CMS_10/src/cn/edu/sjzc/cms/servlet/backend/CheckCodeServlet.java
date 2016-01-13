package cn.edu.sjzc.cms.servlet.backend;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class CheckCodeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("image/jepg");
		String codes="abcdefghijkklmn123456789";
		String checkcode="";
		//创建图片
		BufferedImage image= new BufferedImage(44,20, BufferedImage.TYPE_INT_RGB);
		Graphics2D g=image.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 44, 20);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 43, 19);
		//产生随机字符
		Random r= new Random();
		for(int i=0;i<4;i++){
			char c=codes.charAt(r.nextInt(codes.length()));
			Font font=new Font("Arial",Font.PLAIN,r.nextInt(20)+10);
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawString(String.valueOf(c),i*11+2,15);
			checkcode+=c;
		}
		request.getSession().setAttribute("CHECK_CODE",checkcode);
		//产生随机的点
		for(int i=0;i<25;i++){
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.fillOval(r.nextInt(40),r.nextInt(19),2,2);
		}
		OutputStream out = response.getOutputStream();
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		out.flush();
		out.close();
	}

}
