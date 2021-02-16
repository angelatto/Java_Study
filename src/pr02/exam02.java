package pr02;

public class exam02 {

	public static void main(String[] args) {
		
		// 자동 타입 변환
		byte var1 = 10;
		int var2 = var1;  // 1byte가 4byte에 저장됨 
		System.out.println("var2: " + var2);
		
		
		// 강제 타입 변환 
		int var3 = 1000;
		byte var4 = (byte)var3; // 4byte가 1byte에 저장되지 않음 
		
		//byte 를 4등분해서 앞에는 버리고, 뒤에 하나만 인트에 넣는다. 
		// (byte)의 의미는 byte단위로 쪼개갰다. 
		System.out.println("var4: " + var4);
		
		//--------------/--------------/--------------
		
		// 자동 타입 변환
		int var5 = 10;
		double var6 = var5; // 정수를 실수로 넣는 것은 언제든지 가능하다.
		
		long var7 = 10;
		float var8 = var7; // 정수를 실수로 넣는 것은 언제든지 가능하다.
		
		// 강제 타입 변환 (실수는 정수보다 항상 큰 범위 )
		float var9 = 10.5f;
		long var10 = (long)var9; // 실수를 정수에 넣는 것은 안된다. 
		
		
		//--------------/--------------/--------------
		
		// 실수를 정수로 변환 
		double var11 = 3.14;
		int var12 = (int)var11;
		System.out.println(var12);
	}
}
