package step4;

public class Array1 {

	public static void main(String[] args) {
		// 1. �迭
		
		// ���� �迭
		// Array�� ����� ������� ũ��� ������ �ʴ´�.
		// []�ȿ� ũ�⸦ ���ؾ��Ѵ�.
		int[] arrayInt = new int[20]; 
		
		
		arrayInt[0] = 10;
		arrayInt[12] = 20;
		//arrayInt[21] = 99; // �迭�� ũ����� �̻��� ������ ���ܰ� ���.  ArrayIndexOutOfBoundsException
		
		for(int i=0; i<arrayInt.length; i++) {
			arrayInt[i] = i+1;
		}
		System.out.println(arrayInt[1]);

		// 2. ����
		int [] arrayInt2 = new int[] {1,2,3,4};
		int [] arrayInt3 = {5,6,7,8};
		
		System.out.println(arrayInt2[3]);
		System.out.println(arrayInt3[1]);
		
		// 3. �迭�� ũ��
		System.out.println("�迭�� ũ�� : " + arrayInt.length);
		
		
		// 4. 2���� �迭
		// ���ݱ����� int[] �� �����ϸ� arrray = ������ .. �� �迭����
		/*
		 * int[5][3] array
		 * 				����������..
		 * 				��������
		 * 				������.. 
		 * ������ �迭�� �ȴ�.
		 * 	�ι�°�� [] �������� ���θ� 0���� ����Ѵ�.
		 */
		
		// 4.1. 2���� �迭 ����
		int[][] arrayInt4 = new int[3][];
		arrayInt4[0] = new int[2];
		arrayInt4[0][1] = 10;
		
		int[][] arrayInt5 = {{1}, {2,3}, {3,4,5}};
		System.out.println(arrayInt5[1][0]);
		System.out.println(arrayInt5[2][1]);
		
	}

}
