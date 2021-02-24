package pr10.exam06;

public class BalanceLackException extends Exception{
	
	// 1. 기본 생성자 
	public BalanceLackException() {}
	
	// 2. 부모 생성자 호출  
	public BalanceLackException(String message) {
		super(message);
	}
	
	
}
