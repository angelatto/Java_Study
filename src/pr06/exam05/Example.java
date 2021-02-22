package pr06.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("angelatto", "123456-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("john", "765432-1234117");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		Korean k3 = new Korean();
		Korean k4 = new Korean("kelly");
		
		
	}

}
