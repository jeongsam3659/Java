package step5.exam;

/* 출처예제 http://www.tcpschool.com/java/java_member_field */

class Field{
	static int classVar = 10;	//클래스 변수 선언
	int instanceVar = 20;		//인스턴스 변수 선언.
}

public class Memeber1 {

	public static void main(String[] args) {
	
		int var = 30;					//지역변수 선언
		System.out.println(var + "\n"); //지역변수 참조
		
		Field myField1 = new Field(); //인스턴스 생성
		Field myField2 = new Field();
		
		System.out.println(Field.classVar); //클래스 변수 참조
		System.out.println(myField1.classVar);
		System.out.println(myField2.classVar + "\n띠움");
		
		myField1.classVar = 100; // 클래스 변수 참조
		
		System.out.println(Field.classVar); // 클래스 변수 참조
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n띠움");

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조
        System.out.println(myField2.instanceVar + "\n띠움");

        myField1.instanceVar = 200;               // 인스턴스 변수의 값을 변경

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조
        System.out.println(myField2.instanceVar);
		
	}
}
