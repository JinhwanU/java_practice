package kr.ac.kopo.day02.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("초를 입력 : ");
		int inputSeconds = sc.nextInt();
		sc.nextLine();

		int hours = inputSeconds / 3600;
		int minutes = (inputSeconds % 3600) / 60;
		int seconds = inputSeconds % 60;

		System.out.printf("%d초 : ", inputSeconds);

		if (inputSeconds % 3600 == 0)
			System.out.printf("%d시간", hours);
		else if (seconds % 60 == 0)
			System.out.printf("%d시간 %d분", hours, minutes);
		else
			System.out.printf("%d시간 %d분 %d초", hours, minutes, seconds);

	}
}
