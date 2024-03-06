package kr.ac.kopo.day02;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수 : ");
		int firstInt = sc.nextInt();
		sc.nextLine();

		System.out.println("두번째 정수 : ");
		int secondInt = sc.nextInt();
		sc.nextLine();

		System.out.println("세번째 정수 : ");
		int thirdInt = sc.nextInt();
		sc.nextLine();

		boolean result;
		if (firstInt >= secondInt && firstInt >= thirdInt) {
			System.out.print(firstInt + " ");
			result = secondInt >= thirdInt;
			System.out.print(result ? secondInt + " " + thirdInt : thirdInt + " " + secondInt);
		} else if (secondInt >= firstInt && secondInt >= thirdInt) {
			System.out.print(secondInt + " ");
			result = firstInt >= thirdInt;
			System.out.print(result ? firstInt + " " + thirdInt : thirdInt + " " + firstInt);
		} else {
			System.out.print(thirdInt + " ");
			result = firstInt >= secondInt;
			System.out.print(result ? firstInt + " " + secondInt : secondInt + " " + firstInt);
		}
//		
	}
}
