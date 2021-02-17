package ch04homework;

import java.util.Scanner;

public class 확인7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");
			int input = Integer.parseInt(scan.nextLine());
			
			switch(input){
				case 1:
					System.out.print("예금액> ");
					int deposit = Integer.parseInt(scan.nextLine());
					balance += deposit;
					break;
				case 2:
					System.out.print("출금액> ");
					int withdraw = Integer.parseInt(scan.nextLine());
					balance -= withdraw;
					break;
				case 3:
					System.out.println("잔고> " + String.format("%d", balance));
					break;
				case 4:
					run = false;
					break;
			}
		}
		System.out.print("프로그램 종료");
	}

}
