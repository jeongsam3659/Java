package step5.exam;
class Car1{
	private int currentSpeed;
	private int accelerationTime;

			//1			//2
	public void accelerate(int Speed, int AddSpeed) { // �����
		// ������ 
		System.out.println(AddSpeed + "�ʰ� �ӵ��� �ü� " + Speed + "(��)�� ������!!");
	}
	/*
		�� �޼ҵ�� public ���������ڸ� ����Ͽ� ����Ǿ� 
		�ش� ��ü�� ����ϴ� ���α׷� ��𿡼��� ���� ������ �� �ֽ��ϴ�.
		
		1.��ȯ Ÿ�Կ��� ��� ���� ��ȯ���� �ʴٴ� �ǹ̷� void�� ��õȴ�.
		2.�޼ҵ��� �̸����+�Ű�����(speed,addspeed)�� ���޹޴´�.
	*/
}


//�޼ҵ� �ñ״�ó
public class MethodEx {
	
	public void funA(int x, int y) {
		//
	}
	public void funA(double A, int y, double z) {
		//
	}
	// �޼���ñ״�ó�� funA(int x, int y)�� funA(double A, int y, double z)���� 
	// �޼����̸��� �����ϳ� �Ű����� ����Ʈ�� �ٸ���
	// Java�����Ϸ��� �����ε��� �Լ��� �޼��� �ñ״�ó�� ���ؼ� �����Ѵٴ� 
	// �ǹ̸� ������ �� ���� ���̴�.
}


