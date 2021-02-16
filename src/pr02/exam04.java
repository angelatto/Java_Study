package pr02;

public class exam04 {
	
	public static void main(String[] args) {
		
		// 문자열 => 숫자(정수, 실수 )
		
		// 문자열은 String 타입 변수에 저장한다.
		String var1 = "10";
		System.out.println("var1: " + var1);
		
		// 문자열하고 숫자가 더해지면 문자열 결합 
		String var2 = var1 + 5;
		System.out.println("var2: " + var2);
		
		// 문자열을 정수로 변경해서 연산
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("var3: " + var3);
		
		// 문자열을 실수로 변경해서 연산 
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var5: " + var5);
		
		
		// 숫자 => 문자열 
		int var6 = 3;
		
		// 방법 1 : 숫자랑 문자열 더하면 숫자는 문자열이 된다. 
		String var7 = "" + var6 + 0; 
		
		// 방법 2 : 숫자를 문자열로 변환 
		String var8 = String.valueOf(var6) + 0;
		
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
