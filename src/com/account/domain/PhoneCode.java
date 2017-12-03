package com.account.domain;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class PhoneCode {
/*
 * 
 */
	private Integer id;
	private BigInteger phone;
	private Integer code;
	private String ip;
	private Timestamp createTime;
	private Timestamp expiredTime;
	private Timestamp useTime;
	private Integer isUseTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigInteger getPhone() {
		return phone;
	}
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
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
	public Integer getIsUseTime() {
		return isUseTime;
	}
	public void setIsUseTime(Integer isUseTime) {
		this.isUseTime = isUseTime;
	}

}
