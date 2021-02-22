package pr06.exam07;

public class BoardService {

	// Field
	int count;
	
	// Constructor
	

	// Method
	int getNewBno() {
		return ++count;
	}
	
	void save(String title, String content) {
		int bno = getNewBno();
		System.out.println(bno + "을 저장합니다.");
		System.out.println(title + "을 저장합니다.");
		System.out.println(content + "을 저장합니다.");
	}
	
	int getSum(int[] values) {   // 메소드를 호출할 때 배열의 크기가 결정된다. 
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
	// 메소드 오버로딩 
	int getSum2(int ... values) {   // 메소드를 호출할 때 배열의 크기가 결정된다. 
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
}
