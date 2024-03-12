package kr.ac.kopo.day06;

public class ArrayMain05 {
	public static void main(String[] args) {
		String str = new String("2024년");
		String str2 = "java";
		String str3 = "교육";

		String[] strArr = { str, str2, str3 };

		System.out.println("원소의 총 개수 : " + strArr.length);
		
		for(String s:strArr)
			System.out.println(s);
	}
}
