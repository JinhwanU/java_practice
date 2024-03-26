package kr.ac.kopo.day16;

import java.util.ArrayList;

/*
 * Wrapper Class : 기본자료형을 참조자료형으로 변환
 * 
 * 기본자료형  	 	 참조자료형
 * boolean  	 Boolean
 * char			 Character
 * byte			 Byte
 * short		 Short
 * int      	 Integer
 * long	 		 Long
 * float		 Float
 * double		 Double
 */

public class WrapperMain {

	public static void main(String[] args) {

		int i = 100;
		Integer i2 = new Integer(100);
		int i3 = new Integer(100).intValue(); // 원래는 이런식으로 값을 넣어야하는데
		int i4 = new Integer(100); // JVM(JDK1.5이상)이 auto-unboxing을 해주기 때문에 이것도 가능하다
		Integer i5 = 100; // auto-boxing

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);

		System.out.println(list.get(0));
	}
}
