package pr08.exam04;

public class Car {
	// Field
	public Tire t1; // 이 자리에 대입될 수 있는 것은 Tire 인터페이스로 사용가능한 것들이다.
	public Tire t2; // class XXX implements Tire , XXX 객체가 올 수 있다. 
	public Tire t3;
	public Tire t4;
	
	// Constructor
	
	// Method 
	public void run() {  //  다형성,, 어떤 객체가 들어가던 그 객체의 성질로 실행이 된다. 
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}

}
