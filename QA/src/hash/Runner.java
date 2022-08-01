package hash;

public class Runner {
	
	public static void main(String[] args) {
        //MorseTranslator translator = new MorseTranslator();
       // System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
        
        //String [] products = {"product1", "product2", "product3"};
        
        int n = 1;
		int[] m = {1, 2, 3, 4};
        
        //System.out.println(m.length);
        
        run(1, m);
        
    }
	
	
	public static int run(int n, int[] m) {
		int tot=0;
		 for(int i=0 ; i<m.length; i++) {
			 if(m[i] % 2 ==0) {
				 System.out.println(m[i]);
				tot += m[i];
			 }
		 }
	
		
		
		
		
		
		int total = tot + n;
		System.out.println(total);
		return total;
	}

}
