package pr02;

public class exam03 {
	
	public static void main(String[] args) {
		
		// 1. int 타입 이하의 피연산자의 연산은 결과가 int
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2; // 주의 : byte와 byte의 연산의 결과는 int형이다. 
		
		// 2. int 타입보다 큰 타입이 연산이 되면 큰 타입으로 결과가 된다. 
		int var4 = 10;
		long var5 = 20;
		long var6 = var4 + var5; // long 타입이 들어간 연산은 반드시 결과가 long타입이다. 
		
		int var7 = 10;
		double var8 = 1.5;
		double var9 = var7 + var8;
		
		
	}
}
