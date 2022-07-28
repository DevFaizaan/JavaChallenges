package pair_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class peer {

	public static void main(String args[]) {

		//reverseFactorial(3628800);
		//doggo(2);
		
		Goldilocks(100,80);
		//Calculator(9,12,108);

	}

	public static String reverseFactorial(int num) {
		int n = num;
		int divide_by = 2;
		while(n % divide_by == 0){
			n /= divide_by;
			divide_by++;
		}

		if(n == 1){
			System.out.println(num + " = " + (divide_by - 1) + "!");
			return String.valueOf(divide_by - 1);
		}
		else{
			System.out.println(num + " NONE");
			return "NONE";
		}
	}




	public static ArrayList<String> doggo(int placement) {
		ArrayList<String> str = new ArrayList();

		for(int i =1; i<=100; i++) {
			String num = String.valueOf(i);
			String dog = String.valueOf(placement);
			if(Math.abs(i) % 10 == 1) {
				str.add(num + "st"); 
			}
			else if(Math.abs(i) % 10 == 2) {
				str.add(num + "nd");

			}
			else if(Math.abs(i) % 10 == 3) {
				str.add(num + "rd");
			}
			else {
				str.add(num + "th");
			}
			
			str.remove(dog + "st");
			str.remove(dog + "nd");
			str.remove(dog + "rd");
			str.remove(dog + "th");

		}
		System.out.print(str);
		return str;


	}
	
	public static int Goldilocks(int weight, int maxTemp) {
		int chairCapacity;
		int porridgeTemp;
		String temp = "";
		int count = 0;
		
		ArrayList<Integer> chair = new ArrayList<Integer>();
		chair.add(30);
		chair.add(130);
		chair.add(90);
		chair.add(150);
		chair.add(120);
		chair.add(200);
		chair.add(110);
		ArrayList<Integer> porridge = new ArrayList<Integer>();
		porridge.add(50);
		porridge.add(60);
		porridge.add(100);
		porridge.add(110);
		porridge.add(40);
		porridge.add(90);
		porridge.add(100);
		
		for(int i = 0; i<chair.size(); i++) {
			if(weight < chair.get(i) && maxTemp > porridge.get(i)) {
				temp+= "#" + i + " ";
				count++;
			}
		}
		String output = "Seats " + temp + " have both good enough chairs to not collapse under Goldilocks,\r\n"
				+ "and porridge that is cool enough for her to eat";
		System.out.println(count);
		System.out.println(output);
		 return count;
		
		
	}
	
	
	public static String Calculator(int num1, int num2, int num3) {
		int[] ints = {num1, num2, num3};
		Arrays.sort(ints);
		
		String relate = "Results are " + ints[0] + "*" +ints[1] + "=" + ints[2] 
				+ ", " + ints[2] + "/" + ints[0] + "=" + ints[1] + ", " 
						+ ints[2] + "/" + ints[1] + "=" + ints[0];
		
		System.out.println(Arrays.toString(ints));
		System.out.println(relate);
		return relate;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//return list of strings. if add then do it.
	}


}


