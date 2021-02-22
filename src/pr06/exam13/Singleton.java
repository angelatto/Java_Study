package pr06.exam13;

public class Singleton { // 클래스를 디자인할 때 디자인 패턴 
	
	// Field
	private static Singleton sinleton = new Singleton(); 
	// static -> 객체와 무관하게 생성 
	
	// Constructor
	private Singleton() {} // 외부에서 new 로 객체 생성 못한다. 
	
	// Method
	static Singleton getInstance() {
		return sinleton;
	}
	
	
}
