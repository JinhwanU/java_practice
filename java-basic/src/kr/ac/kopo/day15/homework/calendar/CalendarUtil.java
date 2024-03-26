package kr.ac.kopo.day15.homework.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarUtil {
	private Scanner sc;
	private Calendar c;

	public CalendarUtil() {
		sc = new Scanner(System.in);
		c = Calendar.getInstance();
	}

	public int selectItem() {
		System.out.print("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
		return Integer.parseInt(sc.nextLine());
	}

	public boolean printItem(int item) {

		switch (item) {
		case 1:
			printSpecificYear();
			break;
		case 2:
			printSpecificMonth();
			break;
		case 3:
			System.out.println("종료합니다");
			return true;
		default:
			System.out.println("잘못입력하셨습니다");
		}
		return false;
	}

	public void printSpecificYear() {
		Calendar c = setCalendar(scanInt("년도"), 1);

		for (int month = 1; month <= 12; month++) {
			drawCalendar(c);
			c.set(Calendar.MONTH, month);
		}
	}

	public void printSpecificMonth() {
		Calendar c = setCalendar(scanInt("년도"), scanInt("월"));
		drawCalendar(c);
	}

	public int scanInt(String s) {
		System.out.print(s + "을(를) 입력 : ");
		return Integer.parseInt(sc.nextLine());
	}

	public void drawCalendar(Calendar c) {
		System.out.println("<" + c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH) + 1) + "월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		printDate(c);
	}

	private void printDate(Calendar c) {
		int start = c.get(Calendar.DAY_OF_WEEK);
		int lastDayOfMonth = c.getActualMaximum(Calendar.DATE);

		for (int i = 1; i < start; i++)
			System.out.print("\t");

		for (int day = 1; day <= lastDayOfMonth; day++) {
			System.out.print(day + "\t");
			if (start % 7 == 0)
				System.out.println();
			start++;
		}
		System.out.println();

	}

	public Calendar setCalendar(int year, int month) {
		c.set(year, month - 1, 1);
		return c;
	}

	public void startProgram() {
		boolean exit = false;
		while (!exit) {
			exit = printItem(selectItem());
		}
	}
}
