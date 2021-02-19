package pr05;

public class exam10 {

	public static void main(String[] args) {
		int[] scores1 = {85, 90, 95};
		int[] scores2 = new int[scores1.length + 2];
		
		System.arraycopy(scores1, 0, scores2, 2, scores1.length);
		
		for(int i = 0; i < scores2.length; i++) {
			System.out.print(scores2[i] + "," );
		}
		System.out.println();
		
		System.out.println("scores1[0] 주소 : " + scores1);
		System.out.println("scores2[0] 주소 : " + scores2);
	}
}