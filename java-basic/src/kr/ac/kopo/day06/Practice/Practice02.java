package kr.ac.kopo.day06.Practice;

import java.util.Random;

public class Practice02 {
	public static void main(String[] args) {
		Random r = new Random();
		String[] strNum = new String[5]; // 정수를 문자열로 변환해서 저장하기 위해 String[]로 선언
		String rStr = ""; // reverse 결과물 저장용 변수

		for (int i = 0; i < strNum.length; i++)
			strNum[i] = Integer.toString(r.nextInt(100)); // 정수를 문자열로 변환해 저장

		System.out.println("<PRINT>");
		for (String data : strNum)
			System.out.print(data + " "); // ex)10 11 12 13 14
		System.out.println();

		System.out.println("<REVERSE>");
		for (int i = (strNum.length - 1); i >= 0; i--) { // strNum배열의 뒤쪽 index부터 탐색     ex)14
			for (int j = strNum[i].length() - 1; j >= 0; j--) { // strNum[i]에 저장된 문자열의 길이만큼 반복 + 뒤쪽 index부터 탐색
				rStr += (strNum[i].charAt(j)); // 문자열 "14"의 끝에 있는 '4'를 선택하여 rStr에 붙임 
			} // rStr = ""  ->	"4"	->	"41"
			System.out.print(Integer.parseInt(rStr) + " ");
			rStr = ""; // 이전 결과물 비우기
		}
	}
}
