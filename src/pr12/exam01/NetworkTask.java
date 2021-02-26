package pr12.exam01;

public class NetworkTask implements Runnable{
// Runnable 인터페이스로 사용가능한 클래스 생성 
	
	@Override
	public void run() {
		while(true){
			System.out.println("네트워크 통신을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
	}
	
	

}
