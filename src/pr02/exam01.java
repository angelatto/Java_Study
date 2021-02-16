package pr02;

public class exam01 {

	public static void main(String[] args) {
		/*  정수 타입의 변수 선언과 값 저장 
		 *  byte는 메모리 사용 크기가 1byte 
		 *  char는 메모리 사용 크기가 2byte
		 *  short는 2byte
		 *  int는 4byte
		 *  long은 8byte
		 * 
		 * -> 보통 int를 많이 쓴다.
		 * 그 이유는? 
		 * 
		 * */
		// byte var1 = 1000; byte는 -128에서 127 범위의 숫자만 저장할 수 있다.
		byte var1 = 100; 
		short var2 = 1;
		//int var3 = 20000000000;
		long var4 = 2000000000L;
		
		/*  문자 타입의 변수 선언과 값 저장  
		 *  큰따옴표안에는 문자열, 작은 따옴표 안에는 하나의 문제
		 * */
		char var9 = 65;
		char var10 = 'A';
		System.out.println("var9: " + var9);
		System.out.println("var10: " + var10);
		
		
		/*  실수 타입의 변수 선언과 값 저장
		 * 
		 * 정밀도 높다 : 숫자를 정밀하게 저장할 수 있다. 소수 이하 자리가 좀 더 많이 저장된다. 
		 * float 보다 double이 정밀도가 더 높다. 
		 * 
		 * 따라서 소수에서 정밀한 숫자 또는 더 큰 숫자를 저장하려면 double을 써라. 
		 * */
		float var5 = 2.5f;
		double var6 = 2.5;
		
		float var50 = 0.123456789123456789f;
		double var60 =  0.123456789123456789;
		System.out.println("var50: " + var50);
		System.out.println("var60: " + var60);
		
		
		/* 논리 타입의 변수 선언과 값 저장 */
		boolean var7 = true;
		boolean var8 = false;
		
	
	}

}
