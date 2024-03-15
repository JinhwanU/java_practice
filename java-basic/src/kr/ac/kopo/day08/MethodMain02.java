package kr.ac.kopo.day08;

public class MethodMain02 {

	static int getSum(int a, int b) {
		int sum = 0;
		while (a <= b)
			sum += a++;
		return sum;
	}

	public static void main(String[] args) {

		int a = 1, b = 5;
		System.out.println("총 합 : " + getSum(a, b));
	}
}