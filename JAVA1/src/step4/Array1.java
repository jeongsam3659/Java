package step4;

public class Array1 {

	public static void main(String[] args) {
		// 1. 壕伸
		
		// 舛呪 壕伸
		// Array精 識情獣 幻級嬢遭 滴奄澗 痕馬走 省澗陥.
		// []照拭 滴奄研 舛背醤廃陥.
		int[] arrayInt = new int[20]; 
		
		
		arrayInt[0] = 10;
		arrayInt[12] = 20;
		//arrayInt[21] = 99; // 壕伸税 滴奄骨是 戚雌戚 走舛獣 森須亜 近陥.  ArrayIndexOutOfBoundsException
		
		for(int i=0; i<arrayInt.length; i++) {
			arrayInt[i] = i+1;
		}
		System.out.println(arrayInt[1]);

		// 2. 識情
		int [] arrayInt2 = new int[] {1,2,3,4};
		int [] arrayInt3 = {5,6,7,8};
		
		System.out.println(arrayInt2[3]);
		System.out.println(arrayInt3[1]);
		
		// 3. 壕伸税 滴奄
		System.out.println("壕伸税 滴奄 : " + arrayInt.length);
		
		
		// 4. 2託据 壕伸
		// 走榎猿走澗 int[] 稽 識情馬檎 arrray = けけけ .. 縦 壕伸拭辞
		/*
		 * int[5][3] array
		 * 				けけけけけ..
		 * 				けけけけ
		 * 				けけけ.. 
		 * 縦生稽 壕伸戚 吉陥.
		 * 	砧腰属稽 [] 因拷生稽 垣砧檎 0生稽 昼厭廃陥.
		 */
		
		// 4.1. 2託据 壕伸 識情
		int[][] arrayInt4 = new int[3][];
		arrayInt4[0] = new int[2];
		arrayInt4[0][1] = 10;
		
		int[][] arrayInt5 = {{1}, {2,3}, {3,4,5}};
		System.out.println(arrayInt5[1][0]);
		System.out.println(arrayInt5[2][1]);
		
	}

}
