package step4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
	
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList(); // Ÿ�� �̼��� object�� �����.
		
		list.add(3); 
		list.add(1);
		
		ArrayList<Integer> intList = new ArrayList<Integer>(); // Ÿ���� Integer�� ����.
		ArrayList<Integer> intList_ten = new ArrayList<>(10);  // �ʱ� �뷮(capacity����)
		
		ArrayList<String> colors = new ArrayList();
		
		colors.add("black");
		colors.add("white");
		colors.add("red");
		
		colors.set(0,"no_color");
		
		colors.remove("white");
		
		
		ArrayList<String> strlist1 = new ArrayList<String>(Arrays.asList("op","sub","mid"));
		ArrayList<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4)); 
	
	
		
		System.out.println(list);
		System.out.println(intList_ten.size());
		
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.contains("red"));
		System.out.println(colors.contains("white"));
		System.out.println(colors.indexOf("red"));
		
		
		System.out.println(strlist1);
		System.out.println(intList1);
		
	}
}
