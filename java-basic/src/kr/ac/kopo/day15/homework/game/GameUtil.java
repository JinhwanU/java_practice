package kr.ac.kopo.day15.homework.game;

import java.util.Scanner;

public class GameUtil {
	private Scanner sc = new Scanner(System.in);
	private static int totalScore = 0;

	public char selectGame() {
		System.out.println("게임을 선택하세요");
		System.out.println(" A. 가위바위보");
		System.out.println(" B. 주사위 값 맞추기");
		System.out.println(" C. 종료");
		return sc.nextLine().charAt(0);
	}

	public boolean printResult(char selected) {

		switch (selected) {
		case 'A':
			totalScore += startSRP();
			break;
		case 'B':
			totalScore += startDice();
			break;
		case 'C':
			System.out.println("게임을 종료합니다");
			System.out.println("당신의 total score는 " + totalScore + "입니다");
			return true;
		default:
			System.out.println("다시 입력하세요");
		}
		return false;
	}

	public int startSRP() {
		ScissorsRockPaper srp = new ScissorsRockPaper();
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보 중 하나를 선택하세요");
		System.out.println("(1.가위 2.바위 3.보)");
		return srp.startGame(Integer.parseInt(sc.nextLine()));
	}

	public int startDice() {
		Dice dice = new Dice();
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위를 선택하세요(1~6 중 하나)");
		return dice.startGame(Integer.parseInt(sc.nextLine()));
	}

	public void start() {
		boolean exit = false;
		while (!exit) {
			exit = printResult(selectGame());
		}
	}
}
