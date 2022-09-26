package step5.exam;

class Car {						// 클래스명
	private String modelName;	// 필드
	private int modelYear;		// 필드

	Car(String modelName, int mdoelYear){ // 생성자
		this.modelName = modelName;
		this.modelYear = modelYear;
	}
	
	public String getModel() {	// 메소드
		return this.modelYear + "년식 " + this.modelName;
	}
}

public class ClassEx {
	public static void main(String [] args) {
		
	}
}
