package kr.ac.kopo.day01;

public class HelloMain {
	public static void main(String[] args) {
		System.out.print("Hello ");
		System.out.print("World!");
		System.out.print("\n");
		
		System.out.println("Hello World!");
		
		System.out.printf("[%4d] %c %d = %d\n",3,'+',4,3+4); // ������ ����
		System.out.printf("[%-4d] %c %d = %d\n",3,'+',4,3+4); // ���� ����
		System.out.printf("[%04d] %c %d = %d\n",3,'+',4,3+4); // 0���� �� ���� ä���
	}
}