package pr07.exam03;

public class Child extends Parent {
	//Field
	
	//Constructor
	public Child(String firstName) {
		// 명시적으로 부모 생성자 호출 
		super("Lee", firstName);  // extends 상속 시 컴파일러가 자동으로 이 코드를 추가시켜준다. 
		// supe() 는 부모 생성자를 의미한다. 
		// super는 반드시 자식 생성자에서 첫 째줄에 써야 한다. 
		System.out.println("child 객체 생성 ");
	}
	
	//Method
	public void method2() {
		System.out.println("method2() 실행 ");
	}
	
	@Override
	public void sound() {
		//재정의할 때 부모가 가진 접근제한보다 넓게는 가능하지만 그 반대는 불가능하다. 
		System.out.println("싫어요~~~ ");
	}


}
