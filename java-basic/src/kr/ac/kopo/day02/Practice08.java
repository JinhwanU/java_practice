package kr.ac.kopo.day02;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("물건값을 입력 : ");
		int price = sc.nextInt();
		sc.nextLine();

		int paid = sc.nextInt();
		sc.nextLine();

		int change = paid - price;

		System.out.printf("거스름 돈 : %d원\n", change);
		System.out.printf("1000원 : %d개\n", change / 1000);
		System.out.printf("500원 : %d개\n", (change % 1000) / 500);
		System.out.printf("100원 : %d개\n", (change % 500) / 100);
		System.out.printf("50원 : %d개\n", (change % 100) / 50);
		System.out.printf("10원 : %d개\n", (change % 50) / 10);
	}
}
