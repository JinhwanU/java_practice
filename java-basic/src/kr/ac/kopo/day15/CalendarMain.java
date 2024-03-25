package kr.ac.kopo.day15;

import java.util.Calendar;

public class CalendarMain {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DATE);
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK) - 1;

		String[] dayArr = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 (" + dayArr[day] + ") 입니다");

//		c.set(Calendar.YEAR, 2021);
		c.set(2021, 5, 12);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println("2021년 5월 12일의 요일은 " + dayArr[day - 1] + "요일 입니다");
		System.out.println("3월의 마지막 날 : " + c.getActualMaximum(Calendar.DATE));
		
	}
}
