package pr05;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = {
				{10, 20},
				{15, 25, 35},
				{45, 55, 65, 75}
		};
		
		System.out.println(scores.length); // 3
		System.out.println(scores[0].length); // 2
		System.out.println(scores[1].length); // 3
		System.out.println(scores[2].length); // 4
		
		int sum = 0;
		int count = 0;
		for(int i=0; i < scores.length; i++) {
			for(int k=0; k < scores[i].length; k++) {
				sum += scores[i][k];
				count++;
			}
		}
		
		double avg1 = sum / count;
		double avg2 = (double)sum / count;
		System.out.println(avg1);
		System.out.println(avg2);
	}

}
