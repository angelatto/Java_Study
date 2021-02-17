package ch04homework;

public class 확인6 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(String.format("%s", "*"));
			}
			System.out.println();
		}
	}
}
