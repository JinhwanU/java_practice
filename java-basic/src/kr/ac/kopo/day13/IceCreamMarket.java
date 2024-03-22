package kr.ac.kopo.day13;

import java.util.Scanner;

public class IceCreamMarket {

	private IceCream[] iceList;
	private Scanner sc = new Scanner(System.in);

	public int scanInt() {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	void open() {
		System.out.print("아이스크림 몇개 구입할래? => ");
		int cnt = scanInt();

		iceList = new IceCream[cnt];

		for (int i = 0; i < iceList.length; i++) {
			System.out.println("** " + (i + 1) + "번째 아이스크림 구매정보 입력**");
			System.out.print("아이스크림명 : ");
			String name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			int price = scanInt();

			iceList[i] = new IceCream(name, price);
		}
		printReceipt();
	}

	void printReceipt() {
		int sum = 0;
		System.out.println("------------------------------------");
		System.out.println("\t총 " + iceList.length + "개 아이스크림 구매정보 출력");
		System.out.println("------------------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		System.out.println("------------------------------------");
		for (int i = 0; i < iceList.length; i++) {
			sum += iceList[i].getPrice();
			System.out.printf("%3d\t%-10s\t%5d\n", i + 1, iceList[i].getName(), iceList[i].getPrice());
		}
		System.out.println("------------------------------------");
		System.out.println("총 " + sum + "원 입니다");
	}
}
