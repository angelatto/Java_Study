package pr04;

public class exam05 {

	public static void main(String[] args) {
		
		// 주사위를 던져 나오는 수 얻기 (1, 2, 3, 4, 5, 6)
		double temp = Math.random();
		
		System.out.println(temp); // [0, 1) : 0을 포함하고 1을 포함하지 않는 실수 
		System.out.println(temp * 6); // [0, 6) 실수 
		System.out.println((int)(temp * 6)); // 강제 타입 변환(실수 -> 정수) : [0, 6) 정수
		System.out.println((int)(temp * 6) + 1); // [1, 7) 정수 
		
		int value = (int) (temp * 6) + 1;
		
		if (value % 2 == 0) {
			System.out.println("짝수가 나왔어요 ");
		}else {
			System.out.println("홀수가 나왔어요 ");
		}
	}

}
