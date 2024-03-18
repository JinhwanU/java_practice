package kr.ac.kopo.day10.Practice;

import java.util.Scanner;

public class Icecream {
	Scanner sc = new Scanner(System.in);

	String name;
	int price;

	int setCount() {
		System.out.print("아이스크림 몇개 구입할래?");
		return Integer.parseInt(sc.nextLine());
	}

	Icecream setDetail() {
		Icecream i = new Icecream();
		System.out.print("아이스크림명 : ");
		i.name = sc.nextLine();
		System.out.print("아이스크림 가격 : ");
		i.price = Integer.parseInt(sc.nextLine());
		return i;
	}

	int getTotalPrice(Icecream[] iArr) {
		int sum = 0;
		for (int i = 0; i < iArr.length; i++)
			sum += iArr[i].price;
		return sum;
	}

	void printResult(Icecream[] iArr) {
		System.out.println("< 총 " + iArr.length + "개의 아이스크림 구매정보 출력 >");
		System.out.println("-----------------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		System.out.println("-----------------------------------");

		for (int i = 0; i < iArr.length; i++)
			System.out.print((i + 1) + "\t" + iArr[i].name + "\t\t" + iArr[i].price + "원\n");
		System.out.println("-----------------------------------");
		System.out.printf("총계 : %d원", this.getTotalPrice(iArr));
	}

}
