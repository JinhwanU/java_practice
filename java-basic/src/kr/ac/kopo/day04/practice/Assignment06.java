package kr.ac.kopo.day04.practice;

import java.util.Scanner;

public class Assignment06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("20 ~ 120 사이의 숫자를 입력 : ");
		int number = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= number; i++) {
			boolean check = false;
			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.print("짝");
				check = true;
			}
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝");
				check = true;
			}
			if (i % 10 == 0) {
				for (int j = 0; j < i / 10; j++)
					System.out.print("뽀");
				System.out.print("숑");
				check = true;
			}
			if (!check)
				System.out.print(i);
			System.out.println();
		}
	}

}
