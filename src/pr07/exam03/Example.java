package pr07.exam03;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child("채정");  // 자식 객체를 생성하면서 부모 객체도 생성된다. 
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.sound();
	}

}
