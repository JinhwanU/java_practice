package kr.ac.kopo.day14;

public class Child02 extends Parent {

	private String name;
	private int age;

	Child02() {
		this.name = "자식02";
		this.age = 17;
	}

	@Override
	public void info() {
		System.out.println("나는 " + name + "이고 나이는 " + age + "살 입니다");
	}

	public void play() {
		System.out.println("나는 놉니다");
	}

	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}

}
