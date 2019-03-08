package com.zhoup.design;

import java.util.Calendar;

public class First {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		System.out.println(Calendar.getInstance().getTimeInMillis());
	}
}
