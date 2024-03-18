package kr.ac.kopo.day10.Practice;

public class StringMain {
	public static void main(String[] args) {
		StringUtil util = new StringUtil();

		char ch = 'o';
		int x = 12;
		int y = 5;
		String str = "Hello World!";

		System.out.println("[" + ch + "] isUpperChar : " + util.isUpperChar(ch));
		System.out.println("[" + ch + "] isUpperChar : " + util.isLowerChar(ch));

		System.out.println("[" + x + "," + y + "] max : " + util.max(x, y));
		System.out.println("[" + x + "," + y + "] min : " + util.min(x, y));

		System.out.println("[" + str + "] reverseString : " + util.reverseString(str));
		System.out.println("[" + str + "] toUpperString : " + util.toUpperString(str));
		System.out.println("[" + str + "] toLowerString : " + util.toLowerString(str));

		System.out.println("[" + str + "] checkChar : " + util.checkChar(str, ch));
		System.out.println("[" + str + "] removeChar : " + util.removeChar(str,ch));
	}
}
