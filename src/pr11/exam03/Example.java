package pr11.exam03;

public class Example {

	
	public static void method() {
		long sum = 0;
		for(int i =0; i<1000000; i++) { // 100만번 반복 
			sum += i;
		}
	}
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		method();
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end - start) + "ms");
		

	}

}
