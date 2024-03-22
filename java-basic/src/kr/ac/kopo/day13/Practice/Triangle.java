package kr.ac.kopo.day13.Practice;

public class Triangle extends Shape {
	private int x;
	private int y;

	public Triangle() {
		this.x = createRandNum();
		this.y = createRandNum();
	}

	public double calculateArea() {
		return (x * y) / 2;
	}

	public void printResult() {
		System.out.println("밑변 " + x + ", 높이 " + y + "일 때 삼각형의 넓이는 " + calculateArea() + "이다");
	}
}
