package step5.exam;





public class FinalEx {
// final���� ����.	
	
	public static void main(String[] args) {
		// 1
		int a = 10;			// �Ϲݺ���
		final int b = 20;	// ������
		final int c;		// �����
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(b++); 
		// The final local variable b cannot be assigned. 
		// It must be blank and not using a compound assignment �����޼��� ȣ��.
		
		
		// 4
		FinalClass fc = new FinalClass();
		fc.run();
	}
}

// 2 finalŬ����
final class finalParent{
	public void aaa() {
		System.out.println("a�� ���.");
	}
}
/*
class extends finalParent{
	// finalŬ������ Ȯ��,����� ���Ѵ�.
}
*/


// 3 fianl�޼ҵ�
class nomalParent{
	public final void aaa() {
		System.out.println("a�� ���");
	}
}
class secondClass extends nomalParent{
	
	@Override
	public void aaa() { //Cannot override the final method from �θ�Ŭ����
		System.out.println("�ڽ� a�� ���");
	}
}


// 4 final + static ����
// ���� ��� ����� ������ ����ν� ����� �� �ִ�.
// ����� ������𼭳� ���� ��ġ(static) ���� ������ �ʴ´�(final)
class FinalClass{
	public final static int num = 200;
	public final static double dof = 10.34;
	public final static float flo = 3.14f;
	public final static String str = "����fianl";
	
	public void run() {
		System.out.println(num + " , " +dof + "," + flo + " , "+ str);
	}
}


