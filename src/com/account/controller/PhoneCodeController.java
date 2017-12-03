package com.account.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.asm.ClassReader;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.account.util.CheckPhoneFormat;

public class PhoneCodeController {
	@RequestMapping(value="",method=RequestMethod.POST)
	public String phoneCodeVerify(@RequestParam(value="phone",required=false) String phone,Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
		/*
		 * 判断是否是个手机号
		 */
		if(CheckPhoneFormat.isNumLegal(phone)){
			//是手机号
			//记录最后一次发送的时间
			
		}else{
			//不是手机号
			return "error";
		}
		/*最后一次发送的时间*/
		
		return "";
	}
	
		/**
	 * 获取客户端IP
	 * 
	 * @param request
	 * @return
	 */
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
			System.out.println("There is a mutilple IP string in the request:"+ip);
			return IPS[0].trim();  //handle the  multiple IPS string
		}
		
		return ip;
	}
}
