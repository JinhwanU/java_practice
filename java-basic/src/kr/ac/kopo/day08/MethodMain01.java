package kr.ac.kopo.day08;

/*
	**********
	Hello
	**********
	Hi
	**********
	Good-bye
	**********
 */

public class MethodMain01 {
	static void printStar(char c, int a) {
		for (int i = 0; i < a; i++)
			System.out.print(c);
		System.out.println();
	}

	public static void main(String[] args) {

		printStar('*', 5);
		System.out.println("Hello");
		printStar('#', 10);
		System.out.println("Hi");
		printStar('&', 15);
		System.out.println("Good-bye");
		printStar('%', 20);
	}
}
