package loops;

public class ForEachLoop {

	public static void main(String[] args) {

			
		int  ar[] = {10,20,30,40,50};
		
		
		System.out.println("For Loop");

			for (int i = 0; i < ar.length ; i++) {
				
				System.out.println(i +" "+ ar[i]);
				
			}
		
		
			System.out.println("For Each Loop / Enhance For Loop");
			
			
			for(int x:ar) { // for each loop
				
				System.out.println(x);
				
			}
			
			
			
	}

}
