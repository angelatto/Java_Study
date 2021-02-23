package pr07.exam01;

public class Example {

	public static void main(String[] args) {
		Child child = new Child();  // 자식 객체를 생성하면서 부모 객체도 생성된다. 
		child.field = 10;
		child.field2 = 20;
		child.method1();
		child.method2();
	}
}
