package ch04homework;

public class 확인4 {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		do{
			n1 = (int)(Math.random() * 6) + 1; // 1-6 
			n2 = (int)(Math.random() * 6) + 1;
				
			System.out.println("(" + n1 + "," + n2 + ")");
		}while(n1 + n2 != 5);
	}
}
