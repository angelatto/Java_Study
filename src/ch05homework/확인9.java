package ch05homework;

import java.util.Scanner;

public class 확인9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int total = 0;
		double avg = 0.0;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				total = 0;
			}else if(selectNo == 2) {
				
				if(scores != null) {
					for(int i = 0; i < studentNum; i++) {
						System.out.printf("scores[%d]: ", i);
						scores[i] = scanner.nextInt();
						total += scores[i];
						if(scores[i] > max) {
							max = scores[i];
						}
					}
				}else {
					System.out.println("학생 수와 점수 입력부터 하세요.");
					continue;
				}
	
			}else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
				
			}else if(selectNo == 4) {
				if(scores != null) {					
					System.out.printf("최고 점수: %d\n", max);
					System.out.printf("평균 점수: %.1f\n", (double)total / studentNum);
				}else {
					System.out.println("학생 수와 점수 입력부터 하세요.");
					continue;
				}
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
