package kr.ac.kopo.day06.Practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 현재 배열에 저장된 짝수의 개수
		int[] numArr = new int[5];

		while (cnt < 5) { // 짝수 5개가 저장될때까지 반복
			System.out.print("num" + (cnt + 1) + " : ");
			int input = Integer.parseInt(sc.nextLine());
			if (input % 2 == 0)
				numArr[cnt++] = input;
		}

		System.out.println("< PRINT >");
		for (int data : numArr)
			System.out.print(data + " ");
	}
}
