package pr05;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]); // 0 
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]); // 0.0 
		}
		
		boolean[] arr3 = new boolean[3];
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]); // false
		}
		
		String[] arr4 = new String[3];
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]); // null
		}
	}

}
