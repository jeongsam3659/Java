package step5.exam;





public class FinalEx {
// final변수 예제.	
	
	public static void main(String[] args) {
		// 1
		int a = 10;			// 일반변수
		final int b = 20;	// 권장함
		final int c;		// 비권장
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(b++); 
		// The final local variable b cannot be assigned. 
		// It must be blank and not using a compound assignment 에러메세지 호출.
		
		
		// 4
		FinalClass fc = new FinalClass();
		fc.run();
	}
}

// 2 final클래스
final class finalParent{
	public void aaa() {
		System.out.println("a를 출력.");
	}
}
/*
class extends finalParent{
	// final클래스는 확장,상속을 못한다.
}
*/


// 3 fianl메소드
class nomalParent{
	public final void aaa() {
		System.out.println("a를 출력");
	}
}
class secondClass extends nomalParent{
	
	@Override
	public void aaa() { //Cannot override the final method from 부모클래스
		System.out.println("자식 a를 출격");
	}
}


// 4 final + static 조합
// 둘을 모두 사용한 변수를 상수로써 사용할 수 있다.
// 상수는 언제어디서나 같은 위치(static) 값이 변하지 않는다(final)
class FinalClass{
	public final static int num = 200;
	public final static double dof = 10.34;
	public final static float flo = 3.14f;
	public final static String str = "최종fianl";
	
	public void run() {
		System.out.println(num + " , " +dof + "," + flo + " , "+ str);
	}
}


