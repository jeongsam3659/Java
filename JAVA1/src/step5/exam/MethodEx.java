package step5.exam;
class Car1{
	private int currentSpeed;
	private int accelerationTime;

			//1			//2
	public void accelerate(int Speed, int AddSpeed) { // 선언부
		// 구현부 
		System.out.println(AddSpeed + "초간 속도를 시속 " + Speed + "(으)로 가속함!!");
	}
	/*
		이 메소드는 public 접근제어자를 사용하여 선언되어 
		해당 객체를 사용하는 프로그램 어디에서나 직접 접근할 수 있습니다.
		
		1.반환 타입에도 어떠한 값도 반환하지 않다는 의미로 void가 명시된다.
		2.메소드의 이름명시+매개변수(speed,addspeed)를 전달받는다.
	*/
}


//메소드 시그니처
public class MethodEx {
	
	public void funA(int x, int y) {
		//
	}
	public void funA(double A, int y, double z) {
		//
	}
	// 메서드시그니처는 funA(int x, int y)와 funA(double A, int y, double z)으로 
	// 메서드이름은 동일하나 매개변수 리스트가 다르다
	// Java컴파일러가 오버로딩된 함수를 메서드 시그니처를 통해서 구별한다는 
	// 의미를 이해할 수 있을 것이다.
}


