package kr.ac.kopo.day02;

import java.util.Scanner;

public class IfMain01 {
	/*
	 보유하고 있는 책 권수 입력 : 1 
	 1 book 
	 보유하고 있는 책 권수 입력 : 4 
	 4 books
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보유하고 있는 책 권수 입력 : ");
		int book = sc.nextInt();

		if (book > 1) {
			System.out.println(book + " books");
		} else {
			System.out.println(book + " book");
		}
	}
}
