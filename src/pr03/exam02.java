package pr03;

public class exam02 {

	public static void main(String[] args) {
		
		// 연산의 결과가 boolean으로 나오는 연산기호 
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; // '=='는 값이 같냐 다르냐, false 저장 
		boolean var4 = var1 != var2; // true
		boolean var5 = var1 > var2; // false
		boolean var6 = var1 >= var2; // false
		boolean var7 = var1 < var2; // true
		boolean var8 = var1 <= var2; // true
		boolean var9 = !(var1 == var2); // true 
		boolean var10 = (var1 == var2) || (var1 < var2); // 하나만 트루여도 트루 
		boolean var11 = (var1 == var2) && (var1 < var2);  // 두개다 트루여야 트루 
		
		
		System.out.println(var3);
		System.out.println(var4);
	}

}
