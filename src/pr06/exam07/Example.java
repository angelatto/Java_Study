package pr06.exam07;

public class Example {

	public static void main(String[] args) {

		BoardService bs = new BoardService();
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("제목1", "내용1");
		bs.save("제목2", "내용2");
		
		int[] arr = {1,2,3};
		int sum = bs.getSum(arr);

		sum = bs.getSum(new int[] {1, 2, 3});

		sum = bs.getSum2(1, 2, 3);
		sum = bs.getSum2(1, 2, 3, 4, 5);
	}

}
