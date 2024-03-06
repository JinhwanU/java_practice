package kr.ac.kopo.day02;

import java.util.Scanner;

public class Practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보유하고 있는 책 권수 : ");
		int count = sc.nextInt();
		sc.nextLine();

		if (count < 0)
			System.out.println("잘못입력했습니다.");
		else if (count == 1)
			System.out.printf("1 book");
		else if (count == 0)
			System.out.println("보유하고 있는 책 없음");
		else
			System.out.printf("%d books", count);
	}

}
