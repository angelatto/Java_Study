package pr05;

public class exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginResult loginResult = LoginResult.FAILURE_ID;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("로그인을 성공했군요.");
		} else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("아이디를 다시 입력하세요.");
		} else {
			System.out.println("패스워드를 다시 입력하세요. ");
		}
		
	}

}
