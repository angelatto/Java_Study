package pr07.exam10;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Child(); // 자동 타입 변환 
		parent.field1 = 5;
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent; // 강제 타입 변환 
		child.field1 = 10;
		child.field2 = 10;
		child.method1();
		child.method2();
		child.method3();
		
	}

}
