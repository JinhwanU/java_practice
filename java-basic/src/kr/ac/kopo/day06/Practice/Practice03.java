package kr.ac.kopo.day06.Practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int errCnt = 0; // 에러횟수
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "\'s 성적 : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println("----------------------");
		System.out.println("번호\t성적\t학점");
		System.out.println("----------------------");
		for (int i = 0; i < arr.length; i++)
			if (arr[i] <= 100 && arr[i] >= 0) {
				char grade = ' ';

				if (arr[i] >= 90)
					grade = 'A';
				else if (arr[i] >= 80)
					grade = 'B';
				else if (arr[i] >= 70)
					grade = 'C';
				else if (arr[i] >= 60)
					grade = 'D';
				else
					grade = 'F';

				System.out.println((i + 1) + "\t" + arr[i] + "\t" + grade);
				sum += arr[i];
			} else { // 입력값이 0~100이 아닐때
				System.out.println((i + 1) + "\tERROR!!!");
				errCnt++;
			}

		System.out.println("----------------------");
		System.out.println(arr.length + "회 입력 중 [" + errCnt + "]회 에러 발생");
		System.out.println("총점 :" + sum + "점");
		System.out.printf("평균 : %.2f점\n", (double) sum / arr.length); // ERROR는 0점 처리해서 평균에 반영
//		System.out.printf("평균 : %.2f점", (double) sum / (arr.length-errCnt));
	}

}
