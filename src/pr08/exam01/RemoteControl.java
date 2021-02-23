package pr08.exam01;

public interface RemoteControl { 
	// 상수 
	String COMPANY = "삼성"; // 이 앞에는 public static final이 생략되어 있다. 
	int MAX_VOLUME = 10; // 반드시 값을 지정해줘야 한다.  값을 변경할 수 없다. 
	int MIN_VOLUME = 1; 
	
	// 메소드 (객체 사용 설명) : 추상메소드이지만 추상메소드라고 잘 말하지 않는다. 
	void turnOn();   
	void turnOff();  
	void setVolume(int volume);
	
	/*
	 * 인터페이스는 사용 설명서이다. 
	 * 인터페이스를 구현한 클래스를 만들고 그 클래스로 객체를 생성한다. 
	 * 그 클래스에 실행 내용이 있겠금 모든 메소드를 재정의해주어야 한다. 
	 * 
	 * 
	 * 상수는 구현 객체에서 값을 제한하거나 참조하고 싶을 때 사용한다. 
	 */
}
