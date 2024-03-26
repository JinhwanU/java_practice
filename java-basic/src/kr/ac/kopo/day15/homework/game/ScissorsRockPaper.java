package kr.ac.kopo.day15.homework.game;

public class ScissorsRockPaper implements Game {
	private final static int SCISSOR = 1;
	private final static int ROCK = 2;
	private final static int PAPER = 3;

	@Override
	public int startGame(int you) {
		int me = (int) Math.random() * 3 + 1;

		if (me == you) {
			System.out.println("비겼습니다");
			return 0;
		}

		if (you == SCISSOR) {
			if (me == ROCK) {
				System.out.println("You Lose");
				return 0;
			} else {
				System.out.println("You Win");
				return 1;
			}

		} else if (you == ROCK) {
			if (me == PAPER) {
				System.out.println("You Lose");
				return 0;
			} else {
				System.out.println("You Win");
				return 1;
			}
		} else {
			if (me == SCISSOR) {
				System.out.println("You Lose");
				return 0;
			} else {
				System.out.println("You Win");
				return 1;
			}

		}

	}
}