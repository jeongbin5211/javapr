package io;

import java.text.SimpleDateFormat;

public class DateEx {
	public static void main(String[] args) {
		
		// currentTimeMillis()
		// ��(MM) - ��(mm) �����ϱ�
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
		System.out.println(new SimpleDateFormat("yy.MM.dd").format(System.currentTimeMillis()));
		
		System.out.println(System.currentTimeMillis());
		
	}
}
