package pr05;

public class exam05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열을 생성 
		int[] arr1 = new int[3];
		
		// 배열 항목의 값을 읽고 출력 
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// 배열 항목의 값을 변경 !!!! 
		arr1[0] = 90;
		arr1[1] = 85;
		arr1[2] = 95;
		
		// 배열 항목의 값을 읽고 출력 
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
	}


}
