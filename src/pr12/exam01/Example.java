package pr12.exam01;

public class Example {

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
		// 네트워크 작업을 하는 스레드 생성과 실행
		// 1. 쓰레드 호출하는 첫 번째 방법 
		Thread thread1 = new Thread(new NetworkTask());
		thread1.start(); // start()를 호출하면 run()을 실헹한다.
		
		
		// 뮤직 작업을 하는 스레드 생성과 실행 
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		// 채팅 작업을 하는 스레드 생성과 실행 , 익명 구현 클래스 이용 하기 
		// 러너블 인터페이스를 구현해서 클래스를 만들어서 그걸로 객체를 만들겠다. 
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("채팅 작업을 합니다.");	
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						//e.printStackTrace();
					}
				}
			}
			
		});
		thread3.start();
		
		while(true) {
			System.out.println("메인 스레드 종료");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
		
	}

}
