package pr08.exam03;

public class Example {
	
	// 인터페이스는 상속과 결부시키지 말고, 단지 클래스가 인터페이스를 사용가능 하냐 아니야로 생각해야 한다. 
	
	public static void use1(Shipable shipable) {
		shipable.sailing();
		shipable.anchor();
	}

	public static void use2(Flyable flyable) {
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		use1(myCar);
		use2(myCar);

	}

}
