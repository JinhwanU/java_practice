package kr.ac.kopo.day03.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("2 - 10사이의 정수 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("1 ~ 100 사이의 "+ a +"의 배수 출력");
		int i = 1;
		int curVal = a;
		while (curVal <= 100) {
			System.out.print(curVal + " ");
			i++;
			curVal = a * i;
		}
		System.out.println();
		System.out.println("총 : " + (i - 1) + "개");

	}
}
