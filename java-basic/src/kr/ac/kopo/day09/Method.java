package kr.ac.kopo.day09;

public class Method {

	void call() {
		System.out.println("call() 메소드 호출...");
	}

	void call(int i) {
		System.out.println("call((int)" + i + ") 메소드 호출...");
	}

	void call(String s) {
		System.out.println("call((String)" + s + ") 메소드 호출...");
	}

	void call(double d) {
		System.out.println("call((double)" + d + ") 메소드 호출...");
	}

	void call(char c) {
		System.out.println("call((char)" + c + ") 메소드 호출...");
	}
}
