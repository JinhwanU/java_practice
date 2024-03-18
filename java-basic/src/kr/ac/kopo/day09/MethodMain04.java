package kr.ac.kopo.day09;

public class MethodMain04 {
	public static void main(String[] args) {
		GugudanUtil util = new GugudanUtil();

		util.print(util.inputDan());
		util.printAll();
		util.print(util.inputDan("시작단을 입력 : "), util.inputDan("종료단을 입력 : "));
	}
}