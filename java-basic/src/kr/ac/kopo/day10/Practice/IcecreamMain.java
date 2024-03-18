package kr.ac.kopo.day10.Practice;

public class IcecreamMain {
	public static void main(String[] args) {
		Icecream ic = new Icecream();
		Icecream[] iArr = new Icecream[ic.setCount()];

		for (int i = 0; i < iArr.length; i++)
			iArr[i] = ic.setDetail();

		ic.printResult(iArr);
	}
}
