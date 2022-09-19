package step4;

public class Array1 {

	public static void main(String[] args) {
		// 1. 배열
		
		// 정수 배열
		// Array은 선언시 만들어진 크기는 변하지 않는다.
		// []안에 크기를 정해야한다.
		int[] arrayInt = new int[20]; 
		
		
		arrayInt[0] = 10;
		arrayInt[12] = 20;
		//arrayInt[21] = 99; // 배열의 크기범위 이상이 지정시 예외가 뜬다.  ArrayIndexOutOfBoundsException
		
		for(int i=0; i<arrayInt.length; i++) {
			arrayInt[i] = i+1;
		}
		System.out.println(arrayInt[1]);

		// 2. 선언
		int [] arrayInt2 = new int[] {1,2,3,4};
		int [] arrayInt3 = {5,6,7,8};
		
		System.out.println(arrayInt2[3]);
		System.out.println(arrayInt3[1]);
		
		// 3. 배열의 크기
		System.out.println("배열의 크기 : " + arrayInt.length);
		
		
		// 4. 2차원 배열
		// 지금까지는 int[] 로 선언하면 arrray = ㅁㅁㅁ .. 식 배열에서
		/*
		 * int[5][3] array
		 * 				ㅁㅁㅁㅁㅁ..
		 * 				ㅁㅁㅁㅁ
		 * 				ㅁㅁㅁ.. 
		 * 식으로 배열이 된다.
		 * 	두번째로 [] 공백으로 냅두면 0으로 취급한다.
		 */
		
		// 4.1. 2차원 배열 선언
		int[][] arrayInt4 = new int[3][];
		arrayInt4[0] = new int[2];
		arrayInt4[0][1] = 10;
		
		int[][] arrayInt5 = {{1}, {2,3}, {3,4,5}};
		System.out.println(arrayInt5[1][0]);
		System.out.println(arrayInt5[2][1]);
		
	}

}
