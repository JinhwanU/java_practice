package kr.ac.kopo.day02;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력(알파벳) : ");

		char alphabet = sc.nextLine().charAt(0);

		if (alphabet >= 65 && alphabet < 97)
			System.out.printf("변경된 값 : %c", alphabet + 32);
		else if (alphabet >= 95 && alphabet < 127)
			System.out.printf("변경된 값 : %c", alphabet - 32);
		else
			System.out.printf("알파벳이 아닙니다.");
	}
}
