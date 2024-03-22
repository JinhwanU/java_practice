package kr.ac.kopo.day13.Practice;

import java.util.Scanner;

public class ShapeSelect {

	public void startProgram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요");
		System.out.println("1.삼각형  2.정사각형  3.직사각형  4.원");
		System.out.print("입력 : ");
		int selected = Integer.parseInt(sc.nextLine());

		switch (selected) {
		case 1:
			Triangle t = new Triangle();
			t.printResult();
			break;
		case 2:
			Square s = new Square();
			s.printResult();
			break;
		case 3:
			Rectangle r = new Rectangle();
			r.printResult();
			break;
		case 4:
			Circle c = new Circle();
			c.printResult();
			break;
		}
	}
}
