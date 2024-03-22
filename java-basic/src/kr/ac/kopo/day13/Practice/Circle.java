package kr.ac.kopo.day13.Practice;

public class Circle extends Shape {
	private final double PI = 3.141592;
	private int r;

	public Circle() {
		this.r = createRandNum();
	}

	public double calculateArea() {
		return r * r * PI;
	}

	public void printResult() {
		System.out.println("반지름이 " + r + "일 때 원의 넓이는 " + calculateArea() + "이다");
	}
}
