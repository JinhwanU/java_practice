package kr.ac.kopo.day10;

public class StringMain04 {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = new String("Hello");

//		주소 비교( == )
		if (s == s2)
			System.out.println("s==s2");
		else
			System.out.println("s!=s2");

//		문자열 비교( equals )
		boolean bool = s.equals(s2);
		if (bool)
			System.out.println("equals() : 같다");
		else
			System.out.println("equals() : 다르다");

		s2 = "hello";

		boolean bool2 = s.equalsIgnoreCase(s2);
		if (bool2)
			System.out.println("equalsIgnoreCase() : 같다");
		else
			System.out.println("equalsIgnoreCase() : 다르다");

		System.out.println("--------------------------");

		// 이름이 "홍길동"인 사람을 출력
		String[] names = { "홍길동", "홍길순", "강길동", "윤길동", "홍길동", "홍개똥" };
		for (String name : names)
			if (name.equals("홍길동"))
				System.out.println(name);
		System.out.println("--------------------------");

		// compareTo는 사전순 정렬할 때 유용
		for (String name : names)
			if (name.compareTo("홍길동") == 0)
				System.out.println(name);
		System.out.println("--------------------------");
		// switch JDK14 버전 (break 안써도 적용)
		for (String name : names)
			switch (name) {
			case "홍길동" -> {
				System.out.println(name);
			}
			case "홍길순" -> {
				System.out.println(name);
			}
			}
		System.out.println("--------------------------");
		System.out.println("<\"홍\"씨 성을 가진 이름을 출력 >");
		for (String name : names) {
			if (name.charAt(0) == '홍')
				System.out.println(name);
		}
		System.out.println("--------------------------");
		for (String name : names) {
			if (name.startsWith("홍"))
				System.out.println(name);
		}

		System.out.println("--------------------------");
		System.out.println("<이름이 \"길동\"인 사람을 출력 >");
		for (String name : names) {
			if (name.endsWith("길동"))
				System.out.println(name);
		}

		System.out.println("--------------------------");
		System.out.println("<이름에 \"길\"이 포함된 사람을 출력 >");
		for (String name : names) {
			if (name.contains("길"))
				System.out.println(name);
		}

		String word = "hello world";
		String word2 = "hello";

		int cmp = word.compareTo(word2);
		if (cmp == 0)
			System.out.printf("%s == %s\n", word, word2);
		else if (cmp > 0)
			System.out.printf("%s > %s\n", word, word2);
		else
			System.out.printf("%s < %s\n", word, word2);
	}
}
