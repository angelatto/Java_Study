package pr08.exam01;

public class Audio implements RemoteControl{
	// Audio는 이 인터페이스를 가지고 사용할 수 있도록 구현하겠다.
	// Field 
	private int volume;
	
	// Constructor 
	
	// Method 
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다. ");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다. ");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		
		System.out.println("Audio 볼륨을 " + this.volume + "로 조절합니다.");
		
	}

}
