package kr.ac.kopo.day14;

public class CastMain01 {
	public static void main(String[] args) {

		print(new Parent());

		print(new Child01());

		print(new Child02());
	}

	public static void print(Parent p) {
		p.info();
	}
}
