package kr.ac.kopo.day02.practice;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("물건값을 입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("지불한 돈 : ");
		int paid = sc.nextInt();
		sc.nextLine();

		int change = paid - price;

		System.out.printf("거스름 돈 : %d원\n", change);
		System.out.printf("1000원 : %d개\n", change / 1000); // 1000원 개수 구하기
		System.out.printf("500원 : %d개\n", (change % 1000) / 500); // 500원은 백원 단위에서 500으로 나눈 몫만큼 거슬러준다(거스름돈 % 1000하면 백원 단위)
		System.out.printf("100원 : %d개\n", (change % 500) / 100); // 100원은 백원 단위에서 500원을 제외하고 거슬러준다
		System.out.printf("50원 : %d개\n", (change % 100) / 50); // 50원은 십원 단위에서 50으로 나눈 몫만큼 거슬러준다
		System.out.printf("10원 : %d개\n", (change % 50) / 10); // 10원은 십원 단위에서 50원을 제외하고 거슬러준다
	}
}
