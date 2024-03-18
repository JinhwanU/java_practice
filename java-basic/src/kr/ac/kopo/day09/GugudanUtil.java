package kr.ac.kopo.day09;

import java.util.Scanner;

// 기능클래스
public class GugudanUtil {
	Scanner sc = new Scanner(System.in);

//	키보드로 단을 입력받아 리턴
	int inputDan() {
		System.out.print("단을 입력 : ");
		return Integer.parseInt(sc.nextLine());
	}

//	키보드로 단을 입력받아 리턴 + 메세지
	int inputDan(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}

//	구구단을 출력
	void print(int n) {
		System.out.println("****" + n + "단****");
		for (int i = 1; i < 10; i++)
			System.out.printf("%d x %d = %d\n", n, i, n * i);
	}

//	구구단을 출력 start단~end단
	void print(int start, int end) {
		for (int i = start; i <= end; i++)
			this.print(i);
	}

//	구구단 전체 출력
	void printAll() {
		print(2, 9);
	}
}
