package kr.ac.kopo.day15;

import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		Date d = new Date();

		System.out.println(d);

		// 오늘은 2024년 3월 25일(월)입니다

		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay();

		String[] dayArr = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 (" + dayArr[day] + ") 입니다");
	}
}
