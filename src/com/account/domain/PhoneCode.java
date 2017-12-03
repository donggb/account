package com.account.domain;

import java.sql.Timestamp;
import java.util.Date;

public class PhoneCode {
/*
 * 
 */
	private Integer id;
	private String phone;
	private int code;
	private String ip;
	private Timestamp createTime;
	private Timestamp expiredTime;
	private Timestamp useTime;
	private Timestamp isUseTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getExpiredTime() {
		return expiredTime;
	}
	public void setExpiredTime(Timestamp expiredTime) {
		this.expiredTime = expiredTime;
	}
	public Timestamp getUseTime() {
		return useTime;
	}
	public void setUseTime(Timestamp useTime) {
		this.useTime = useTime;
	}
	public Timestamp getIsUseTime() {
		return isUseTime;
	}
	public void setIsUseTime(Timestamp isUseTime) {
		this.isUseTime = isUseTime;
	}
	
}
