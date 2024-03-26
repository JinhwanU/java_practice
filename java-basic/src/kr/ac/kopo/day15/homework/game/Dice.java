package kr.ac.kopo.day15.homework.game;

public class Dice implements Game {

	@Override
	public int startGame(int you) {
		int me = (int) (Math.random() * 6) + 1;
		
		if(me==you) {
			System.out.println("You Win");
			return 1;
		}else {
			System.out.println("You Lose");
			return 0;
		}
	}

}
