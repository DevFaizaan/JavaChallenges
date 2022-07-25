package javap2;

import java.util.ArrayList;
import java.util.Collections;

public class arraylists {
public static void main(String args[]) {
	
//	ArrayList<Integer> inte = new ArrayList();
//	inte.add(54);
//	inte.add(63);
//	inte.add(37);
//	inte.add(913);
//	inte.add(13);
//	
//	
//	//inte.remove(2);
//	//System.out.println(inte.get(2));
//	
//	 Collections.sort(inte);
//
//     for (int i : inte) {
//         System.out.println(i);
//     }
	
	//enhancedForLoop();
	int nums [] = new int[4];
	
	for(int i=0; i<nums.length ; i++) {
		nums[i] = i;
		//System.out.println(i);
	}
	for(int j : nums) {
		j = j*10;
		System.out.println(j);
	}
}


public static void enhancedForLoop() {
	
    ArrayList<String> str = new ArrayList();
	str.add("hello");
	str.add("my");
	str.add("name");
	str.add("is");
	str.add("...");
	
//	for(String s : str) {
//		System.out.println(s);
//	}
	
	
	ArrayList<Integer> inte = new ArrayList();
	inte.add(5);
	inte.add(3);
	inte.add(7);
	inte.add(2);
	inte.add(4);
	
	for(Integer i: inte) {
		eflBool(i);
	}
	
}

public static boolean eflBool(Integer num) {
	if(num % 2 == 0) {
		
		System.out.println(Math.pow(num, 3));
		return true;
	}
	else {
		System.out.println(Math.pow(num, 2));
		
		return false;
	}
}
	
}
