package kr.ac.kopo.day15.inter01;

public class SamsungTV {

	private boolean power;
//	private int channelNo;
//	private int volumeSize;

	public SamsungTV() {
		System.out.println("SamsungTV 구매완료...");
//		power = false;
//		channelNo = 3;
//		volumeSize = 7;
	}

	public void turnOn() {
		System.out.println("전원 On...");
	}

	public void turnOff() {
		System.out.println("전원 Off...");
	}

	public void channelUp() {
		System.out.println("채널 Up...");
	}

	public void channelDown() {
		System.out.println("채널 Down...");
	}

	public void soundUp() {
		System.out.println("음량 Up...");
	}

	public void soundDown() {
		System.out.println("음량 Down...");
	}

	public void mute() {
		System.out.println("음소거중...");
	}

}
