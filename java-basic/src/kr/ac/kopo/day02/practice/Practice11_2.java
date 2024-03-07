package kr.ac.kopo.day02.practice;

import java.util.Scanner;

public class Practice11_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 4개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt(); // 연속적인 nextInt()는 입력 조건과 버퍼의 특징상 가능

//		int maxNum = num1; // 가장 큰 값을 의미하는 maxNum에 임시로 num1 대입
//
//		if (num2 > maxNum) // maxNum과 num2 크기 비교
//			maxNum = num2; // num2이 더 크다면 maxNum을 num2로 갱신, 그렇지 않다면 maxNum 값은 그대로
//		if (num3 > maxNum) // maxNum과 num3 크기 비교
//			maxNum = num3; // num3이 더 크다면 maxNum을 num3로 갱신, 그렇지 않다면 maxNum 값은 그대로
//		if (num4 > maxNum) // maxNum과 num4 크기 비교
//			maxNum = num4; // num4이 더 크다면 maxNum을 num4로 갱신, 그렇지 않다면 maxNum 값은 그대로

		int maxNum1 = num1 > num2 ? num1 : num2;
		int maxNum2 = num3 > num4 ? num3 : num4;
		System.out.println(maxNum1 > maxNum2 ? maxNum1 : maxNum2);
	}
}
