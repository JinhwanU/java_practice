package kr.ac.kopo.day04.practice;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 : ");
		int dan = Integer.parseInt(sc.nextLine());

		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i < 10; i++)
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
	}
}
