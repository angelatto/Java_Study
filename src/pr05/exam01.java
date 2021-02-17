package pr05;

public class exam01 {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 10;
		
		// 값 자체 비교 
		System.out.println(var1 == var2); // true
		System.out.println(var1 != var2); // false
		
		String var3 = "자바";
		String var4 = "자바";
		String var5 = new String("자바");
		
		// 번지비교 
		System.out.println(var3 == var4); // true - 리터럴이 같으면 주소가 같다.
		System.out.println(var3 == var5); // false - new로 생성한 객체는 다른 주소를 가리킴 
		System.out.println(var3 != var4); // false
		System.out.println(var3.equals(var5)); // true	
		
	}
}
