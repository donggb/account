package com.account.service;

import java.util.Date;

import com.account.domain.PhoneCode;



public interface PhoneCodeService {
	/*
	1) 限制短信请求的发送时间间隔：单个手机用户请求发送一次动态短信后，服务器端锁60秒 才能进行第二次动态短信验证码请求；
    2）同手机号每天最大量发送限制10条；
    3）同IP每天最大发送限制如每天50条；
	 */
	/*最后一次发送的时间*/
	PhoneCode getLastRequestByPhoneNum(long phone);
	/*最后一次未使用的申请*/
	PhoneCode getLastUnusedRequestByPhoneNum(long phone);
	/*每日同一手机号的请求次数*/
	int getEverydayPhoneRequest(long phone,Date day);
	/*每日同一ip的请求次数*/
	int getEverydayIpRequest(String ip,Date day);
	/*新的用户*/
	void insertPhoneCode(PhoneCode user);
	/*更新手机验证码 */
	void updatePhoneCode(Date useTime,int isUseTime,int id);
	
}
