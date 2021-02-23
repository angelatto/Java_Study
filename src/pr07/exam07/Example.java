package pr07.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();  // 자식 객체를 생성하면서 부모 객체도 생성된다. 
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); // 중요개념 : 타입은 부모지만,, 자식에서 재정의된 메소드가 호출된다. 
		// 변수의 타입이 Parent이기 때문에 method3() 은 사용할 수 없다. 
		
	}

}
