package step5.exam;

class Car {						// Ŭ������
	private String modelName;	// �ʵ�
	private int modelYear;		// �ʵ�

	Car(String modelName, int mdoelYear){ // ������
		this.modelName = modelName;
		this.modelYear = modelYear;
	}
	
	public String getModel() {	// �޼ҵ�
		return this.modelYear + "��� " + this.modelName;
	}
}

public class ClassEx {
	public static void main(String [] args) {
		
	}
}
