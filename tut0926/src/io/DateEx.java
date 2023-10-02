package io;

import java.text.SimpleDateFormat;

public class DateEx {
	public static void main(String[] args) {
		
		// currentTimeMillis()
		// 월(MM) - 분(mm) 구분하기
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
		System.out.println(new SimpleDateFormat("yy.MM.dd").format(System.currentTimeMillis()));
		
		System.out.println(System.currentTimeMillis());
		
	}
}
