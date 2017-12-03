package com.account.test;

import java.io.IOException;

import org.junit.Test;

import com.account.util.MobileMessageCheck;

public class TestCode {
	@Test
	public void TestCode() throws IOException{
		String code = MobileMessageCheck.checkMsg("18810298941");
		System.out.println(code);
	}
}
