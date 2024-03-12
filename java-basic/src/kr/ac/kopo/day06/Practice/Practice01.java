package kr.ac.kopo.day06.Practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("num" + (i + 1) + " : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("< 짝 수 >");
		for (int data : arr) {
			if (data % 2 == 0) {
				sumEven += data;
				System.out.print(data + " ");
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + sumEven);

		System.out.println("< 홀 수 >");
		for (int data : arr) {
			if (data % 2 == 1) {
				sumOdd += data;
				System.out.print(data + " ");
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + sumOdd);

	}
}
