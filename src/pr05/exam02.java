package pr05;

import java.util.Arrays;

public class exam02 { // 배열을 생성하는 첫 번째 방법 

	public static void main(String[] args) { // main 메소드 
		// 변수를 선언하면서 값 목록을 제공할 경우 
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);

		// 변수를 선언하면서 값 목록을 제공할 경우 
		int[] scores2 = null;
		// scores2 = {90, 85, 95}; 잘못된 코드 
		scores2 = new int[] {10, 20, 30};
		// 컴파일러는 scores가 참조변수인것은 알아도 정확히 배열을 가리키는 건 모를수가 있다.
		// 컴파일러를 위해서 int 배열임을 명시적으로 나타내준다. 
		
		// 메소드 호출 - 값을 전달하면서 호출하겠다 
		add(10); // call by value
		add2(scores1); // call by reference
		add2(scores2);
		add2( new int[]{10, 20, 30});
	}
	
	// 메소드 선언 
	public static void add(int value) { // add 메소드 
		System.out.println("값: ");
		
	}
	
	// 메소드 선언 
	public static void add2(int[] arr) { 
		System.out.println("값: " + Arrays.toString(arr));
		System.out.println("번지: " + arr);
	}

}
