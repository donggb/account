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
		try{
		// 判断是否是个手机号
		if(CheckPhoneFormat.isNumLegal(phone)){
			//判断ip是否受限 获取来访者ip
			String reqIp = CheckPhoneFormat.getIpAddr(request);
			//从数据库中查询该ip
			
		}else{
			//不是手机号
			return "error";
		}
		}catch (Exception e) {
			new RuntimeException(e);
		}
		return "null";
	}
}
