package pr08.exam01;

public class Example {
	
	//매개변수 rc에는 이 RemoteControl 인터페이스로 사용가능한 객체만 올 수 있다. 
	public static void method(RemoteControl rc) { 
		// 인터페이스의 설명대로만 사용하는 코드 
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		// 다형성 : 코드는 똑같은데 어떤 객체가 매개로 들어오냐에 따라 실행 결과가 달라진다. 
		
		
		// static을 안붙이면 인스턴스 메소드가 되기 때문에 객체를 만들고 나서 이 메소드를 사용해야 한다. 
	}
	
	public static void main(String[] args) {
		
		RemoteControl rc = new Audio();
		// 해석: 이 인터페이스를 가지고 이 객체 사용하려고 한다. 
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);

		method(new Television());
		method(new Audio());
		
	}

}
