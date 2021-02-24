package pr10.exam06;

public class Account {

	public void deposit(String account, int money) throws NoAccountException{
		if(account == null) {
			// 예외 발생 코드 
			throw new NoAccountException("입금 계좌가 없습니다."); 
			// throws와 헷갈리지 말기 
		}
		System.out.println("입금 성공");
	}
	
	public void withdraw(String account, int money) 
			throws NoAccountException, BalanceLackException{
		// 메소드에 붙여주는 이유는 너를 호출하는 쪽에서 예외처리하라고 알려주는 것이다. 
		int balance = 10000;
		
		if(account == null) {
			// 예외 발생 코드 
			throw new NoAccountException("출금 계좌가 없습니다."); 
			// throws와 헷갈리지 말기 
			// 메소드에 throws 도 날려줘야함 
		} else if(money > balance) {
			throw new BalanceLackException("잔고가 부족합니다."); //에러메세지 전달 
//			throw new BalanceLackException(); //에러메세지가 null 
			
		} else {
			System.out.println("출금 성공");
		}
	}
}
