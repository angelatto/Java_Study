package pr07.exam11;

/*
 * 클래스마다 공통된 부분을 가져와서 만든 클래스라면
 * abstract을 붙일 수 있다. 
 */
public abstract class Animal { 
	// 이 클래스를 객체로 쓰려는 것은 아니고, 공통 부분을 빼서 만든 것이다. 
	
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void eat() {
		System.out.println("먹습니다. ");
	}

	public abstract void sound(); 
	/*  일반 클래스는 추상 메소드를 가질 수 없다.
	 *  추상 클래스만 추상 메소드를 가질 수 있다. 
	 *  
	 *  추상메소드는 자식쪽에서 재정의해서 써야 한다. 
	 */
}
