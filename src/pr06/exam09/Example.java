package pr06.exam09;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.area(10); // 정확한 타입이 없으면 자동타입변환이 가능한 타입을 찾는다. 
		double result2 = myCalc.area(10, 3);
		
		
	}

}
