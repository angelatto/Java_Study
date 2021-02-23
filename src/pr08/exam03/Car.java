package pr08.exam03;

public class Car implements Flyable, Shipable{
	
	/*
	 * Shipable 
	 */
	
	@Override
	public void sailing() {
		System.out.println("항해 중 입니다.");
	}

	@Override
	public void anchor() {
		System.out.println("정박합니다. ");
	}

	/*
	 * Flyable 
	 */
	@Override
	public void takeOff() {
		System.out.println("이륙하고 있습니다. ");
		
	}

	@Override
	public void land() {
		System.out.println("착륙하고 있습니다. ");
	}

	@Override
	public void fly() {
		System.out.println("비행하고 있습니다. ");
	}
	

}
