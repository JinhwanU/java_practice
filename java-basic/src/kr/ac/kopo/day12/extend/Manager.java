package kr.ac.kopo.day12.extend;

public class Manager extends Employee {
	private Employee[] empList;

	public Manager() {

	}

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	void info() {
		super.info();
		System.out.println("--------------------------------------");
		System.out.println("\t< 관리사원 리스트 >");
		System.out.println("--------------------------------------");
		for (Employee e : empList)
			e.info();
		System.out.println("--------------------------------------");
	}
}
