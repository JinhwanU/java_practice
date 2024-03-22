package kr.ac.kopo.day13.Practice;

import java.util.Random;

abstract public class Shape {
	private Random r = new Random();

	public int createRandNum() {
		return r.nextInt(10) + 1;
	}

	public abstract double calculateArea();

	public abstract void printResult();
}
