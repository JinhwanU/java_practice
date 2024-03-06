package kr.ac.kopo.day01;

/**
 * print() println() printf()의 차이점
 * 
 * @author Jinhwan
 * @version 0.1
 */

public class HelloMain {
	/**
	 * 
	 * @param args 테스트
	 */
	public static void main(String[] args) {
		System.out.print("Hello ");
		System.out.print("World!");
		System.out.print("\n");
		
		System.out.println("Hello World!");
		
		System.out.printf("[%4d] %c %d = %d\n",3,'+',4,3+4); // 오른쪽 정렬
		System.out.printf("[%-4d] %c %d = %d\n",3,'+',4,3+4); // 왼쪽 정렬
		System.out.printf("[%04d] %c %d = %d\n",3,'+',4,3+4); // 0으로 빈 공간 채우기
		}
}