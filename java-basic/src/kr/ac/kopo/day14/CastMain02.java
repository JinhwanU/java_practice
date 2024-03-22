package kr.ac.kopo.day14;

public class CastMain02 {
	public static void main(String[] args) {
		// 묵시적형변환 부모타입 = 자식타입
		// Parent p = new Child01();

		// 명시적형변환 자식타입 = (자식타입)부모타입 > 단, 이전에 묵시적형변환이 된 상태여야함

		Parent p = new Child01();
		Child01 c1 = (Child01) p;

		c1.study();
		c1.sleep();
		c1.info();

		info(new Parent());
		info(new Child01());
		info(new Child02());
	}

	public static void info(Parent p) {
		if (p instanceof Child01) {
			Child01 c = (Child01) p;
			c.study();
			c.sleep();
		} else if (p instanceof Child02) {
			Child02 c = (Child02) p;
			c.play();
			c.sing();
		}
		p.info();
		
		/*
		 * System.out.println(p instanceof Child01); // instanceof 는 상속관계일때만 사용할 수 있음
		 * System.out.println(p instanceof Child02); 
		 * System.out.println(p instanceof Parent); // 자식에는 부모가 포함되어있으므로 항상 true
		 */
	}
}
