package pr07.exam06.pack1;

public class Parent {
	//Field
	protected int field1; 
	// 같은 패키지에서는 쓸 수 있다 (디폴트와 같음), 일반 다른 패키지는 사용 불가능 
	// but 다른 패키지에서 자식 클래스라면 protected를 모두 사용할 수 있다. 
	
	//Constructor
	
	
	//Method
	protected void parentMethod() {
		System.out.println("parentMethod() 실행");
	}


}
