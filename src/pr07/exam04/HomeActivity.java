package pr07.exam04;

public class HomeActivity extends Activity {
	
	public HomeActivity() {
		super(); // 부모 생성자 호출 
	}
	
	@Override
	public void onCreate() {
		super.onCreate(); // super는 부모를 참조하는 변수이다. 
		System.out.println("자식이 UI 요소를 생성합니다. ");
		System.out.println("자식이 UI 요소의 이벤트를 처리합니다. ");
	}
	
	
}
