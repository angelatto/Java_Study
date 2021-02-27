package pr11.exam02;

public class Member {

	private String id;
	private String name;
	
	
	public Member(String id, String name) {
		super(); // 생략 가능. 컴파일러가 자동적으로 붙여줌. 
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
}
