package com.perfectomobile.test;

import org.apache.commons.lang.StringUtils;

public class Test {
	
	public static void main(String[] args) {
		String str = "hello";
		String str2 = StringUtils.center(str, 20);
		System.out.println(str2);
	}

}
