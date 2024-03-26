package kr.ac.kopo.day16;

import java.util.ArrayList;

public class ListMain {
	public static void main(String[] args) {
		/*
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(12.34);
		list.add("Hello");
		list.add(new Random());

		Random r = (Random) list.get(3);
		System.out.println(r.nextInt(10));
		*/
		
		//ArrayList의 타입에는 참조형 변수만 가능하다(기본자료형 X)
//		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<>(); //JDK1.7부터 생략가능
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");

		String str = list.get(1);
		System.out.println(str);
		System.out.println(list.toString());

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100); // auto-boxing
		int a = list2.get(0); // auto-unboxing
	}
}
