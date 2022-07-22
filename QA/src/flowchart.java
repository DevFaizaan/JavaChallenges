
public class flowchart {


	public static int flowExercise(int a, int b, boolean c) {
		int results = c==true ? a+b : a*b;
		System.out.println(results);
		return results;	
	}

	public static void flowExcercise2(int A) {
		if(A>2000) {
			System.out.println("A");
			if(A>6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if(A>4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if(A>100) {
				System.out.println("3");
				if(A>600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if(A>500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
		
		
	}
	
	
	public static void flowExercise3() {
		
		for(int A = 100; A<200; A++) {
			System.out.println(A);
		}
	}
	
public static void flowExercise4() {
		int A = 100;
		
		for(A = 100; A<200; A++) {
			if(A%2 ==0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
		}
//		while(A<=200) {
//			if(A%2 ==0) {
//				System.out.println("-");
//				A++;
//			}
//			else {
//				System.out.println("*");
//				A++;
//			}
//		}
		
	}
	

}