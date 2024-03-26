package kr.ac.kopo.day15.inter02;

public class LGTV implements TV {

	private boolean power;
	private int channelNo;
	private int volumeSize;
	private int currentVolumeSize;
	private boolean isMute;

	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		power = false;
		channelNo = 3;
		volumeSize = 7;
	}

	public void info() {
		System.out.println("현재 채널 : " + channelNo + ", 음량 : " + volumeSize);
	}

	@Override
	public void powerOn() {
		System.out.println("TV 전원을 켭니다");
		power = true;
		info();
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원을 끕니다");
		power = false;
	}

	@Override
	public void soundUp() {
		if (volumeSize < TV.MAX_VOLUME_SIZE) {
			System.out.println("볼륨을 높입니다");
			volumeSize++;
		}
		info();
	}

	@Override
	public void soundDown() {
		if (volumeSize > TV.MIN_VOLUME_SIZE) {
			System.out.println("볼륨을 낮춥니다");
			volumeSize--;
		}
		info();
	}

	@Override
	public void channelUp() {
		System.out.println("채널번호를 올립니다");
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("채널번호를 내립니다");
		channelNo--;
		info();
	}

	@Override
	public void mute() {
		if (!isMute) {
			System.out.println("음소거중");
			currentVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
		} else {
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
		}
		isMute = !isMute;
		info();
	}
}