package pr09.exam02;

public class A { // 클래스의 괄호 블록에 속한 것만 접근제한자를 붙일 수 있다. 
	
	// 1. 인스턴스 멤버 클래스 
	public class B {
		public int field;
		public B() {};
		public void method() {};
	}
	
	// 2. 정적 멤버 클래스 
	// static이 일반적으로 이용된다. 
	public static class C {
		public int field;
		public C() {};
		public void method() {};
	}
	
	public void method() {
		class D {
			public int field;
			public D() {}
			public void method() {}
		}
		
		D d = new D();
		d.field = 1;
		d.method();
	}

}
