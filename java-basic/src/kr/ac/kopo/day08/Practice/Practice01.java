package kr.ac.kopo.day08.Practice;

import java.util.Scanner;
//참조 클래스
class Icecream {
	String name;
	int price;
}
// 실행 클래스
public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입할래?");
		int n = Integer.parseInt(sc.nextLine());
		
		Icecream[] iArr = new Icecream[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			iArr[i] = new Icecream();
			System.out.print("아이스크림명 : ");
			iArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iArr[i].price = Integer.parseInt(sc.nextLine());
		}

		System.out.println("< 총 " + n + "개의 아이스크림 구매정보 출력 >");
		System.out.println("-----------------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		System.out.println("-----------------------------------");

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "\t" + iArr[i].name + "\t\t" + iArr[i].price + "원\n");
			sum += iArr[i].price;
		}
		System.out.println("-----------------------------------");
		System.out.println("총계 : " + sum + "원");
		System.out.printf("총계 : %d원", sum);
	}
}
