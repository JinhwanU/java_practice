package kr.ac.kopo.day04.practice;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 : ");
		int x = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k < i + 1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}

/*
		*
		**
		***
		****
		*****
*/