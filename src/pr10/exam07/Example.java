package pr10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		} catch(Exception e) {
			// 예외 메세지 별로 예외 처리 할 때 사용 
			String message = e.getMessage();
			
			// 디버깅할 때 사용할 수 있는 예외 정보 
			System.out.println(e.toString());
			// e.printStackTrace(); // 개발할 때만 확인, 사용자에게는 보여주지 않는다. 
			
//			if(message.contains("0001")) {
//				System.out.println("0001 에러 코드 발생");
//			}
		}

	}
	
	public static void method()throws NoAccountException {
		throw new NoAccountException("0001: 입금 계좌가 없음");
		
	}

}
