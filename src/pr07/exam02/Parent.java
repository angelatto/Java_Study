package pr07.exam02;

public class Parent {
	//Field
	public String lastName;
	public String firstName;
	
	//Constructor
	public Parent(String lastName, String firstName) {
		System.out.println("Parent 객체 생성 ");
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	//Method
	public void method1() {
		System.out.println("method1() 실행 ");
	}
	
}
