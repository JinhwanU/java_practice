package kr.ac.kopo.day04.practice;

public class Assignment04 {
	public static void main(String[] args) {
		final int MOVEMENT = 5;
		int position = 0;
		int hour = 0;
		while (position < 100) {
			hour++;
			position += MOVEMENT;
			position -= (position < 50 ? 1 : 2);
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %d\n", hour, position);
		}
	}
}
