package pr07.exam01;

public class Child extends Parent {
	//Field
	public int field2;
	
	//Constructor
	public Child() {
		super();  // extends 상속 시 컴파일러가 자동으로 이 코드를 추가시켜준다. 
		// super() 는 부모 생성자를 의미한다. 
		System.out.println("child 객체 생성 ");
	}
	
	//Method
	public void method2() {
		System.out.println("method2() 실행 ");
	}
	

}
