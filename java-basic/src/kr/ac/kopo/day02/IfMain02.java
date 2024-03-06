package kr.ac.kopo.day02;

import java.util.Scanner;

public class IfMain02 {

	/*
	 보유하고 있는 책 권수 입력 : 1 
	 1 book 
	 보유하고 있는 책 권수 입력 : 4 
	 4 books
	 보유하고 있는 책 권수 입력 : 0
	 책 없음
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보유하고 있는 책 권수 입력 : ");
		int book = sc.nextInt();

		if (book > 1) {
			System.out.println(book + " books");
		} else if (book == 1) {
			System.out.println(book + " book");
		} else {
			System.out.println("책 없음");
		}
	}
}
