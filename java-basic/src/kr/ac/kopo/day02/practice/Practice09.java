package kr.ac.kopo.day02.practice;

import java.util.Random;

public class Practice09 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = sc.nextInt();
//		sc.nextLine();

//		입력대신 Random 함수 적용
		Random r = new Random();
		System.out.println("보유하고 있는 책 권수 : ");
		int count = r.nextInt(100); // 음수 포함 X
//		int count = r.nextInt() % 100; // 음수 포함

		if (count > 1)
			System.out.println(count + " books");
		else if (count == 1)
			System.out.println("1 book");
		else if (count == 0)
			System.out.println("보유하고 있는 책 없음");
		else
			System.out.println("잘못입력했습니다");
	}

}
