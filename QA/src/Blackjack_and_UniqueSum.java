
public class Blackjack_and_UniqueSum {

	public static int Blackjack(int a, int b) {
		int value = 0;
		if((a+b)<=42){
			if(a>21 && b<21) {
				value = b;
			}
			if(b>21 && a<21) {
				value = a;
			}
			if(a<21 && b<21) {
				if(21-a > 21-b) {
					value = a;
				}
				else {
					value = b;
				}
			}
		}
		else {
			value =0;
		}
		return value;
		
	}
	
	public static int UniqueSum(int a, int b, int c) {
		int sum = 0;
		if(!(a==c && a==b && b==c)) {
			sum = a+b+c;
		}
		else {
			if(a==b) {
				sum = c;
			}
			if(a==c) {
				sum = b;
			}
			if(b==c) {
				sum = a;
			}
		}
		
		return sum;
	}

}
