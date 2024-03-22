package kr.ac.kopo.day14;

public class Child01 extends Parent {

	private String name;
	private int age;

	Child01() {
		this.name = "자식01";
		this.age = 20;
	}

	@Override
	public void info() {
		System.out.println("나는 " + name + "이고 나이는 " + age + "살 입니다");
	}

	public void study() {
		System.out.println("나는 공부를 합니다");
	}

	public void sleep() {
		System.out.println("나는 잠을 잡니다");
	}
	
}
