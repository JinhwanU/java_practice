package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain05 {
	public static void main(String[] args) {
		String str = "hello world";
		char search = 'o';

		int idx = str.indexOf(search);
		System.out.println("indexOf() : " + search + "문자의 위치 : " + idx);

		idx = str.lastIndexOf(search);
		System.out.println("lastIndexOf() : " + search + "문자의 위치 : " + idx);

		search = 'p';
		idx = str.indexOf(search);
		System.out.println("indexOf() : " + search + "문자의 위치 : " + idx);

		search = 'l';
		System.out.println("< [" + str + "]에서 " + search + "문자의 위치 >");
		idx = str.indexOf(search);
		while (idx != -1) {
			System.out.println("찾은 위치 : " + idx);
			idx = str.indexOf(search, idx + 1);
		}
		System.out.println("-------------------------");
		idx = -1;
		while (true) {
			idx = str.indexOf(search, idx + 1);
			if (idx == -1)
				break;
			System.out.println("찾은 위치 : " + idx);
		}

		str = "hello world!!";
		String sub = str.substring(6, 11);
		System.out.println("str : " + str);
		System.out.println("substr(6,11) : " + sub);
		System.out.println("substr(6) : " + str.substring(6));

		str = "hello";
		String str2 = "world";
		System.out.println(str.concat(str2));

		str = "         hello world         ";
		System.out.printf("[%s] 길이 : %d\n", str, str.length());
		System.out.printf("[%s.trim()] 길이 : %d\n", str, str.trim().length());

		str = "Hello World!!!";
		System.out.println("str : " + str);
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());

		String date = "2024-03-18";

		String[] dateArr = date.split("-");
		System.out.println(Arrays.toString(dateArr));

		// 특정 문자를 구분자로 사용시 \\로 감싸준다
		str = "172.31.9.164";
		String[] ipArr = str.split("\\.");
		System.out.println(Arrays.toString(ipArr));

		
	}
}
