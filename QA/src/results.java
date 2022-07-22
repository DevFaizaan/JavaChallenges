
public class results {

	static double Physics = 80;
	static double Chemistry = 70;
	static double Biology = 145;
	static double total =  Physics + Chemistry + Biology;
	float percentage;
	static double physicsPer = ((Physics/150)*100);
	static double chemistryPer = ((Chemistry/150)*100);
	static double biologyPer = ((Biology/150)*100);
	
	public static void output() {
		if((Physics/150)*60 < 60) {
			System.out.println("Physics Score: " + Physics + "\n" + "Status: Fail");
		}
		else {
			System.out.println("Physics Score: " + Physics + "\n" + "Status: Pass");
		}
		if((Physics/150)*60 < 60) {
			System.out.println("Chemistry Score: " + Chemistry + "\n" + "Status: Fail");
		}
		else {
			System.out.println("Chemistry Score: " + Chemistry + "\n" + "Status: Pass");
		}
		if((Physics/150)*60 < 60) {
			System.out.println("Biology Score: " + Biology + "\n" + "Status: Fail");
		}
		else {
			System.out.println("Biology Score: " + Biology + "\n" + "Status: Pass");
		}
		
		//System.out.println("Physics Score: " + Physics);
		//System.out.println("Chemistry Score: " + Chemistry);
		//System.out.println("Biology Score: " + Biology);
		System.out.println("Total Score: " + total);
			
	}
	
	public static void overall() {
		System.out.println();
		System.out.println("Overall");
		if((total*100)/450 >60 && physicsPer>60 && chemistryPer>60 && biologyPer>60  ){
			System.out.println("Overall Percentage: " + ((total*100)/450) + "%");
			System.out.println("Status: Pass");
		}
		else if((total*100)/450 >60 && physicsPer<60 || chemistryPer<60 || biologyPer<60) {
			String failed = "";
			if(physicsPer<60) {
				failed+= " Physics " + String.valueOf(Math.round(physicsPer)) + "%";  
			}
			if(chemistryPer<60) {
				failed+= " Chemistry " + String.valueOf(Math.round(chemistryPer)) + "%";
			}
			if(biologyPer<60) {
				failed+= " Biology " + String.valueOf(Math.round(biologyPer)) + "%";
			}
			
			//System.out.println("Overall Percentage: " + ((total*100)/450) + "%");
			
			System.out.println("Status: Fail" + "\n" + "Failed Subjects:" + failed);
		}
		
		System.out.println("Overall Percentage: " + Math.round(((total*100)/450)) + "%");
	}
	
}
