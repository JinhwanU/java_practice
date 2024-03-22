package kr.ac.kopo.day13.Practice;

public class Square extends Rectangle {
	public void printResult() {
		System.out.println("너비가 " + x + "인 정사각형의 넓이는 " + (int)calculateArea() + "이다");
	}
}
