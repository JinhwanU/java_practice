package kr.ac.kopo.day13.Practice;

public class Rectangle extends Shape {

	protected int x;
	private int y;

	public Rectangle() {
		this.x = createRandNum();
		this.y = createRandNum();
	}

	public double calculateArea() {
		return x * y;
	}

	public void printResult() {
		System.out.println("가로 " + x + ", 세로 " + y + "일 때 직사각형의 넓이는 " + (int) calculateArea() + "이다");
	}
}
