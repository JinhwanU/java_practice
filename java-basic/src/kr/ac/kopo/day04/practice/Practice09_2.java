package kr.ac.kopo.day04.practice;

import java.util.Scanner;

public class Practice09_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 : ");
		int x = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
		*****
		 ****
		  ***
		   **
		    *
*/