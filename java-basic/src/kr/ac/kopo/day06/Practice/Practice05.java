package kr.ac.kopo.day06.Practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nArr = new int[100];
		int pos = 0; // 배열의 index 정보 저장을 위한 변수

		System.out.print("1 ~ 100 사이의 정수 입력 : ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++)
			if (n % i == 0) // 약수 판별
				nArr[pos++] = i; // 약수이면 nArr배열에 순서대로 저장

		System.out.println(n + " 약수의 개수 : " + pos + "개");
		for (int i = 0; i < pos; i++) // nArr[]의 pos 인덱스까지만 탐색(0~pos)
			System.out.print(nArr[i] + " ");
	}
}
