package pr15.exam05;


public class User {

	private String id;
	private String name;
	
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// 문자열이 같으면 똑같은 해시코드가 만들어진다. 
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User temp = (User) obj; // 강제 형변
			if(id.equals(temp.id)) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
