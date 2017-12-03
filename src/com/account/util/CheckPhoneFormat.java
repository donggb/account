package com.account.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.servlet.http.HttpServletRequest;

public class CheckPhoneFormat {
	//判断是否是个手机号
	 public static boolean isNumLegal(String str) throws PatternSyntaxException {
	        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
	        Pattern p = Pattern.compile(regExp);
	        Matcher m = p.matcher(str);
	        return m.matches();
	    }
	 
	 //获取ip
		public static String getIpAddr(HttpServletRequest request) {
			String ip = request.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}
			
			if (ip.indexOf(",")>0){
				String IPS[]=ip.split(",");
				return IPS[0].trim();  
			}
			return ip;
		}
}
