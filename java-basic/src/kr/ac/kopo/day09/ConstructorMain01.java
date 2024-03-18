package kr.ac.kopo.day09;

/*
	생성자 특징
	1. 클래스명 동일
	2. 반환형 없음
	3. 디폴트 생성자 지원(클래스 내에 선언된 생성자가 없는 경우 JVM이 자동으로 생성)
	4. 생성자 오버로딩 지원
	5. 속성 초기화
 */

class Car {
	private String name;

	Car() {
		System.out.println("default 생성자 호출");
	}

	Car(String name) {
		this.name = name;
		System.out.println(this.name);
	}
}

public class ConstructorMain01 {
	public static void main(String[] args) {
		new Car();
		new Car("소나타");
	}
}
