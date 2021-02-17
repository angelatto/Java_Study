package pr04;

import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		
		// 키보드로 입력한 내용을 받기 위해 Scanner 생성 
		Scanner scanner = new Scanner(System.in);
				
		// 키보드에서 입력한 내용을 data 변수에 저장 
		while(true) {
			System.out.print("숫자1 : ");
			int data1 = Integer.parseInt(scanner.nextLine());
			
			System.out.print("숫자2 : ");
			int data2 = Integer.parseInt(scanner.nextLine());
			
			int result = Math.addExact(data1, data2);
			System.out.println(result);
		}
		
				
		

	}

}
