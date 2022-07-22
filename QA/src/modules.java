
public class modules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//results.output();
		//results.overall();
		
		//flowchart.flowExcercise2(4200);
		//Tax.taxCalculator(35000);
		
		//flowchart.flowExercise3();
		
		Iteration.printNumAmount();
	}
	
	public static String fizzBuzz(int num) {
		String output = "";
		
		if(num%3 ==0) {
			output+= "Fizz";
			
		}
	    if(num%5==0) {
			output+= "Buzz";
		}
		if(!(num%3 ==0 || num%5==0)) { 
		output = String.valueOf(num);
		}
		System.out.println(output);
		return output;
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static double div(double a, double b) {
		double division = 0;
		if(a<b) {
			division = a/b;
		}
		else {
			System.out.println("Division cannot be performed");
		}
		return division;
	}
	
	
	
	

}
