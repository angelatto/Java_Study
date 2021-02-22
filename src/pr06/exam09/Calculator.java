package pr06.exam09;

public class Calculator {
	// Field
	
	// Constructor
	
	
	// Method
	// 사각형 면적
	double area(double w) { 
		return w * w;
	}
	
	double area(double w, double h) {
		return w * h;
	}
	
	// 원의 면적
	double areaCircle(double r) { // 메소드오버로딩 불가,, double타입의 매개변수 하나를 가진 메소드가 이미 존재..
		return r * r * Math.PI;
	}	
	

}
