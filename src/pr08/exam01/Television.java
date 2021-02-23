package pr08.exam01;

public class Television implements RemoteControl {
	private int volume;
	

	// 메소드 (객체 사용 설명) : 추상메소드이지만 추상메소드라고 잘 말하지 않는다. 
	public void turnOn() {
		System.out.println("tv를 켭니다. ");
	}
	
	public void turnOff() {
		System.out.println("tv를 끕니다. ");
	}
	
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		
		System.out.println("tv를 볼륨을 " + this.volume + " 킵니다. ");
	}
		
	
}
