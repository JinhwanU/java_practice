package kr.ac.kopo.day09.Practice;

import java.util.Random;
import java.util.Scanner;

public class PracticeUtil01 {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);

	int[] createAnswer() {
		int[] answerArr = new int[3];
		for (int i = 0; i < answerArr.length; i++)
			answerArr[i] = r.nextInt(10);
		return answerArr;
	}

	void startGame(int[] answerArr) {
		int strike;
		int ball;
		int tryCnt = 0;

		do {
			strike = 0;
			ball = 0;
			int[] inputArr = this.inputAnswer();
			for (int i = 0; i < answerArr.length; i++) {
				for (int j = 0; j < answerArr.length; j++) {
					if (i == j && answerArr[i] == inputArr[j])
						strike++;
					else if (i != j && answerArr[i] == inputArr[j])
						ball++;
				}
			}
			tryCnt++;
			System.out.println(strike + "스트라이크 " + ball + "ball");
		} while (strike != 3);
		System.out.println("정답입니다!" + tryCnt + "회 시도");
	}

	int[] inputAnswer() {
		int[] inputArr = new int[3];
		System.out.print("3자리 숫자 입력 : ");
		String answer = sc.nextLine();
		for (int i = 0; i < answer.length(); i++)
			inputArr[i] = answer.charAt(i) - '0';
		return inputArr;
	}
}