package kr.ac.kopo.day02.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력(알파벳) : ");

		char alphabet = sc.nextLine().charAt(0);
		
		if (alphabet >= 'A' && alphabet <= 'Z') // A~Z : 65~90
			System.out.printf("변경된 값 : %c", alphabet + 32); // 대문자 A(65) 소문자 a(97)이 32만큼 차이나기 때문에 32를 더해줌
		else if (alphabet >= 'a' && alphabet <= 'z') // a~z : 97~122
			System.out.printf("변경된 값 : %c", alphabet - 32);
		else
			System.out.printf("알파벳이 아닙니다.");
	}
}
