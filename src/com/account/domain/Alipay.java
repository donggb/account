package com.account.domain;

import java.util.List;

public class Alipay {
	/*
CREATE TABLE Alipay(
  Alipay_ID int PRIMARY KEY ,
  Alipay_USERNAME VARCHAR(100) NOT NULL ,
  Alipay_ACCOUNT VARCHAR(100) NOT NULL
);
	 */
	private List<User> ulist;
	private String username;
	private String account;

	public List<User> getUlist() {
		return ulist;
	}
	public void setUlist(List<User> ulist) {
		this.ulist = ulist;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}
