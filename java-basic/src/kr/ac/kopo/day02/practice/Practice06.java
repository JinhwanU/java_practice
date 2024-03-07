package kr.ac.kopo.day02.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		
//		문제 착각함
//		Scanner sc = new Scanner(System.in);
//		System.out.println("알파벳 입력 : ");
//		System.out.printf("개수 ? %d",sc.next().length());
		
//		수정한 코드
		int count = ('Z' - 'A' + 1) * 2;
		System.out.println("알파벳의 개수 : " + count);
	}
}
