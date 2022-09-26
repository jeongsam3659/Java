package step5.exam;

/* ��ó���� http://www.tcpschool.com/java/java_member_field */

class Field{
	static int classVar = 10;	//Ŭ���� ���� ����
	int instanceVar = 20;		//�ν��Ͻ� ���� ����.
}

public class Memeber1 {

	public static void main(String[] args) {
	
		int var = 30;					//�������� ����
		System.out.println(var + "\n"); //�������� ����
		
		Field myField1 = new Field(); //�ν��Ͻ� ����
		Field myField2 = new Field();
		
		System.out.println(Field.classVar); //Ŭ���� ���� ����
		System.out.println(myField1.classVar);
		System.out.println(myField2.classVar + "\n���");
		
		myField1.classVar = 100; // Ŭ���� ���� ����
		
		System.out.println(Field.classVar); // Ŭ���� ���� ����
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n���");

        System.out.println(myField1.instanceVar); // �ν��Ͻ� ���� ����
        System.out.println(myField2.instanceVar + "\n���");

        myField1.instanceVar = 200;               // �ν��Ͻ� ������ ���� ����

        System.out.println(myField1.instanceVar); // �ν��Ͻ� ���� ����
        System.out.println(myField2.instanceVar);
		
	}
}
