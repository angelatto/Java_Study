package pr05;

public class exam03 { // 배열을 생성하는 첫 번째 방법 

	public static void main(String[] args) { // main 메소드 

		int[] scores1 = {90, 85, 95};
		int[] scores2 = {90, 85, 95};
		int[] scores3 = scores1;
		
		System.out.println(scores1 == scores2); // false
		System.out.println(scores1 == scores3); // true 
	}
}
