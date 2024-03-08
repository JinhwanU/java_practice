package kr.ac.kopo.day04.practice;

import java.util.Random;
import java.util.Scanner;

public class Assignment05 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = r.nextInt(100) + 1;
		int cnt = 6;
		int start = 1;
		int end = 100;

		while (cnt > 0) {
			cnt--;

			System.out.printf("%d - %d : ", start, end);
			int number = Integer.parseInt(sc.nextLine());

			if (number == answer) {
				System.out.println("축하합니다 정답입니다!!");
				break;
			} else if (number < answer) {
				System.out.println(number + "보다 큰수입니다.");
				start = number + 1;
			} else {
				System.out.println(number + "보다 작은수입니다.");
				end = number - 1;
			}

			System.out.println("기회는 총 " + cnt + "번 남았습니다.");

			if (cnt <= 0) {
				System.out.println("아쉽습니다. 기회를 다 소진하셨습니다.");
				System.out.printf("정답은 [%d]입니다", answer);
			}
		}

	}
}
