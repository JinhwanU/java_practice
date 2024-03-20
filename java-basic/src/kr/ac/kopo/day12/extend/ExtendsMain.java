package kr.ac.kopo.day12.extend;

class One {
	One() {
		System.out.println("One() 생성자 호출");
	}
}

class Two extends One {
	Two() {
		System.out.println("Two() 생성자 호출");
	}
}

class Three extends Two {
	Three() {
		System.out.println("Three() 생성자 호출");
	}
}

public class ExtendsMain {
	public static void main(String[] args) {
		new Two();
		new Three();
	}
}
