package kr.ac.kopo.day04.practice;

import java.util.Scanner;

public class Assignment03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단 : ");
		int start = Integer.parseInt(sc.nextLine());
		System.out.print("종료단 : ");
		int end = Integer.parseInt(sc.nextLine());

		for (int i = start; i <= end; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 1; j < 10; j++)
				System.out.printf("%d * %d = %d\n", i, j, i * j);
		}
	}

}
