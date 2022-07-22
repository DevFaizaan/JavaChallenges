import java.text.DecimalFormat;

public class Tax {
	
	public static void taxCalculator(double salary) {
		String salaryPer;
		if(salary <= 14999) {
			salaryPer = "No tax";
		}
		else if(salary <= 19999) {
			salaryPer = "10%";
		}
		else if(salary<= 29999) {
			salaryPer = "15%";
		}
		else if(salary<=44999) {
			salaryPer = "20%";
		}
		else if(!(salary<=45000)) {
			salaryPer = "25%";
		}
		actualSalaryTax(salary);
	}
	
	
	

	public static double actualSalaryTax(double salary) {
		
		double tax = 0;
		if(salary <= 14999) {
			tax = 0;
		}
		else if(salary <= 19999) {
			tax = 0.1*(salary - 14999);
		}
		else if(salary<= 29999) {
			tax = 0.15*(salary - 20000) + 0.1*(19999 - 15000);
		}
		else if(salary<=44999) {
			tax = 0.2*(salary - 30000) + 0.15*(29999 - 20000) + 0.1*(19999-15000);
		}
		else if(!(salary<=45000)) {
			tax = 0.25*(salary - 45000) + 0.2*(44999 - 30000) + 0.15*(29999 - 20000) + 0.1*(19999-15000);
		}
		
		tax = Math.round(tax*100)/100;
		System.out.println("£" + tax);
		return tax;
	}
	
}
