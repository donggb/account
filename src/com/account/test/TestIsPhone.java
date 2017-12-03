package com.account.test;

import org.junit.Test;

import com.account.util.CheckPhoneFormat;

public class TestIsPhone {
 @Test
 	public void demo(){
	 String phone = "21312132412";
	 boolean a = CheckPhoneFormat.isNumLegal(phone);
	 System.out.println(a);
 	}
}
