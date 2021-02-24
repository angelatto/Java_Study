package pr09.exam02;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); // a 객체를 통해서 B 생성자로 접근한다. -> A의 B클래스 타입으로 변수 선언한다. 
		b.field = 1;
		b.method();
		
		A.C c = new A.C(); // A객체를 생성하지 않고 바로 클래스로 접근 
		c.field = 1;
		c.method();
		
	}

}
