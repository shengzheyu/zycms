package cn.edu.sjzc.cms.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	public static String format(Date d,String pattern){
		return new SimpleDateFormat(pattern).format(d);
	}
}
