package kr.ac.kopo.day10;

public class StringMain01 {
	public static void main(String[] args) {
		String s = new String();
		// 객체인데 주소가 출력되지 않는 이유 : "출력(print)" 시에는 s 대신 s.toString()을 자동호출하기 때문이다
		System.out.println("s : [" + s + "]");
		System.out.println("s : [" + s.toString() + "]");

		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		String s2 = new String(chars);
		System.out.println("s : [" + s2 + "]");

		String s3 = new String(chars, 3, 4); // 3번 인덱스부터 4개만큼 출력
		System.out.println("s : [" + s3 + "]");

		String s4 = new String("Hello");
		System.out.println("s : [" + s4 + "]");

	}
}
