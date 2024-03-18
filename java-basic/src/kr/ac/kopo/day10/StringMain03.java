package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain03 {
	public static void main(String[] args) {

		String s = new String("Hello World!");
		int len = s.length();
//		System.out.printf("[%s] 길이 : %d\n", s, len);
//		System.out.printf("7번째 위치한 문자 : %c\n", s.charAt(7));
//		System.out.println("Hello".charAt(0));

		char[] chars = new char[5];
		s.getChars(6, 10, chars, 0);

		System.out.println(chars);
		System.out.println("chars : " + chars); // 주소값 출력됨
		System.out.println("chars : " + Arrays.toString(chars));

		int[] test = { 1, 2, 3, 4, 5 };
		System.out.println(test);
	}
}