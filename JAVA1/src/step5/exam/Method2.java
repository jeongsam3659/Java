package step5.exam;

class CarModel{
	// ����
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	// ������
	CarModel(){	}
	
	CarModel(String modelName, int modelYear, String color, int maxSpeed){
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	
	// �޼ҵ�
	public String getModel() {
		return this.modelYear+"��� "+ this.modelName+ " " + this.color; 
	}
}

public class Method2 {
	public static void main(String[] args) {
		CarModel myCar = new CarModel("���̿���",2020,"ȸ��",220);
		System.out.println(myCar.getModel());

	}

}
