package kr.ac.kopo.day10.Practice;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);

	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}

	void subtract(int x, int y) {
		System.out.printf("%d - %d = %d\n", x, y, x - y);
	}

	void multiply(int x, int y) {
		System.out.printf("%d x %d = %d\n", x, y, x * y);
	}

	void devide(int x, int y) {
		System.out.printf("%d / %d = %.1f\n", x, y, (double) x / y);
	}

	void checkPrime(int x) {
		System.out.print(x + " 소수체크 : ");
		if (x < 2) {
			System.out.println("false");
			return;
		}
		if (x == 2) {
			System.out.println("true\n");
			return;
		}
		for (int i = 2; i < Math.sqrt(x); i++)
			if (x % i == 0) {
				System.out.println("false");
				return;
			}
		System.out.println("true");
	}

	int input() {
		System.out.print("정수 : ");
		return Integer.parseInt(sc.nextLine());
	}

	void run() {
		int x = input();
		int y = input();
		add(x, y);
		subtract(x, y);
		multiply(x, y);
		devide(x, y);
		checkPrime(x);
		checkPrime(y);
	}
}
