package kr.ac.kopo.day08;

class Handphone {
	String name;
	String number;
	String company;
}

public class HandphoneMain {
	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.number = "010-1111-2222";
		hp.company = "삼성";

		Handphone hp2 = new Handphone();
		hp2.name = "강길동";
		hp2.number = "010-2222-3333";
		hp2.company = "애플";

		Handphone hp3 = new Handphone();
		hp3.name = "고길동";
		hp3.number = "010-3333-4444";
		hp3.company = "LG";

		Handphone[] hpArr = { hp, hp2, hp3 };

		for (Handphone h : hpArr) {
			System.out.println("소유주 : " + h.name);
			System.out.println("번호 : " + h.number);
			System.out.println("제조사 : " + h.company);
			System.out.println();
		}

		System.out.println("-----------------------------");
		for (int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주 : " + hpArr[i].name);
			System.out.println("번호 : " + hpArr[i].number);
			System.out.println("제조사 : " + hpArr[i].company);
			System.out.println();
		}
	}
}
