package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("짝수를 입력하세요 : ");
			int num = sc.nextInt();

			if (num % 2 == 1) {
				throw new OddException("입력된 숫자가 홀수입니다");
//			System.out.println("홀수입니다... 잘못입력하셨습니다");
			}
			System.out.println("출력 : " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
