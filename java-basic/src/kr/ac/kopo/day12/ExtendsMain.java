package kr.ac.kopo.day12;

class Cat {

}

public class ExtendsMain {
	public static void main(String[] args) {
		Cat c = new Cat();

		System.out.println(c);
		System.out.println(c.toString()); // 모든 클래스는 Object 클래스를 상속하기 때문에 toString()메서드를 사용 가능

	}
}
