package kr.ac.kopo.day12;

public class Employee {
	String name;
	int salary;
	static int empTotal;

	public Employee() {
		this("알수없음", -1);
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		Employee.empTotal++;
	}

	public static int getEmpTotal() {
		return empTotal;
	}

	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원");
	}

}
