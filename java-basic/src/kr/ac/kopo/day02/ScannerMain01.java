package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		sc.nextLine(); // 버퍼를 비워주는 용도로 사용
		System.out.println("a : " + a);

		System.out.println("실수 입력 : ");
		double b = sc.nextDouble();
		sc.nextLine(); // 버퍼를 비워주는 용도로 사용
		System.out.println("b : " + b);

		System.out.println("문자열 입력 : ");
		String c = sc.next(); // 단어단위
//		String c = sc.nextLine(); // 문장단위
		sc.nextLine(); // 버퍼를 비워주는 용도로 사용
		System.out.println("c : " + c);

		System.out.println("문자 입력 : ");
		char d = sc.nextLine().charAt(0);
		System.out.println("d : " + d);
	}
}
