package step5.exam;

//1
final class CarFinal{				// 이 클래스는 상속을 통해 서브클래스를 생성할 수 없음.
	final int VAR= 5;				// 이 필드는 상수화되어 값을 변경할 수 없음 //선언만 하는건 불가능. 초기값을 지정해줘야한다.
	final void brake() {			// 이 메소드는 오버라이딩을 통해 재정의할 수 없음
		final double Max_num = 10.2;// 이 지역변수는 상수화되어 값을 변경할 수 없음.
	}
}

//2
final class Person{
	Person(){
		
	}
	Person(String a){
		
	}
}

public class FinalMember {
	
	//2
	String name ="";
	public void setName(String name) {
		this.name = name;
	}
/*
	public class Doctor extends Person {
		// 오버라이드 불가능
		public void setName(String name) {
		    this.name = "Doctor " + name;
		 }
	}
*/	

	public static void main(String[] args) {
		
	}
}
