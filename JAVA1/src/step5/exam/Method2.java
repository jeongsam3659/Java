package step5.exam;

class CarModel{
	// 변수
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	// 생성자
	CarModel(){	}
	
	CarModel(String modelName, int modelYear, String color, int maxSpeed){
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	
	// 메소드
	public String getModel() {
		return this.modelYear+"년식 "+ this.modelName+ " " + this.color; 
	}
}

public class Method2 {
	public static void main(String[] args) {
		CarModel myCar = new CarModel("아이오나",2020,"회색",220);
		System.out.println(myCar.getModel());

	}

}
