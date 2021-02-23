package pr07.exam02;

public class Child extends Parent {
	//Field
	
	//Constructor
	public Child(String firstName) {
		// 명시적으로 부모 생성자 호출 
		super("Lee", firstName); 
		// supe() 는 부모 생성자를 의미한다. 
		// super는 반드시 자식 생성자에서 첫 째줄에 써야 한다. 
		System.out.println("child 객체 생성 ");
	}
	
	//Method
	public void method2() {
		System.out.println("method2() 실행 ");
	}
	

}
