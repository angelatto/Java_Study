package pr10.exam06;

public class Example {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		try {
			String ano = null;
			account.deposit(ano, 1000);
		} catch (NoAccountException e){
			System.out.println(e.getMessage());
		}
		
		/*
		   NoAccountException이 런타임에러를 상속받았기 때문에 컴파일러가 체크안해주니까 
		   여기서 try-catch안써줘도 컴파일 에러가 안나긴 했지만 
		   경험적으로 반드시 try-catch 써주어야 함..
		 */
		
		String ano = null;
		try {
			account.withdraw(ano, 1000);
			account.withdraw(ano, 1000000);
			
		} catch (NoAccountException e) {
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * Exception을 상속 받았기 때문에 try-catch 안써주면 컴파일에러남 
		 */
	}

}
