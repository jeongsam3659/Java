package step5.exam;

//1
final class CarFinal{				// �� Ŭ������ ����� ���� ����Ŭ������ ������ �� ����.
	final int VAR= 5;				// �� �ʵ�� ���ȭ�Ǿ� ���� ������ �� ���� //���� �ϴ°� �Ұ���. �ʱⰪ�� ����������Ѵ�.
	final void brake() {			// �� �޼ҵ�� �������̵��� ���� �������� �� ����
		final double Max_num = 10.2;// �� ���������� ���ȭ�Ǿ� ���� ������ �� ����.
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
		// �������̵� �Ұ���
		public void setName(String name) {
		    this.name = "Doctor " + name;
		 }
	}
*/	

	public static void main(String[] args) {
		
	}
}
