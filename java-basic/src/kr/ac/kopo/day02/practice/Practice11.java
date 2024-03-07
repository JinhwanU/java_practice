package kr.ac.kopo.day02.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 4개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt(); // 연속적인 nextInt()는 입력 조건과 버퍼의 특징상 가능

		if (num1 >= num2 && num1 >= num3 && num1 >= num4) // num1이 가장 큰 경우
			System.out.println(num1);
		else if (num2 >= num1 && num2 >= num3 && num2 >= num4) // num2이 가장 큰 경우
			System.out.println(num2);
		else if (num3 >= num1 && num3 >= num2 && num3 >= num4) // num3이 가장 큰 경우
			System.out.println(num3);
		else // num4이 가장 큰 경우
			System.out.println(num4);
	}
}
