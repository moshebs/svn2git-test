package com.perfectomobile.test;

import org.apache.commons.lang3.StringUtils;

public class Test {
	
	public static void main(String[] args) {
		String str = "hello111511122112";
		String str2 = StringUtils.center(str, 20);
		System.out.println(str2);
	}

}
