package arrays;

public class ArrayDemo {

	public static void main(String  args[]) {


		int ar[] = {2,4,6,8};
		
		System.out.println(ar);
		
		System.out.println("array size "+ar.length);
		
		for (int i = 0; i < ar.length; i++) {
			
			
			System.out.println(i +" "+ ar[i]);
		}
		
		
		int  ar1[] = new int[4];
		
		System.out.println(ar1);
		
		ar1[0] = 99;
		
			
		for (int i = 0; i < ar1.length; i++) {
			
			System.out.println(ar1[i]);
		}
		
		
		
		String names[] = new String[3];
		
			System.out.println(names);
			
			names[0] = "tom";
			
			System.out.println(names[0]);

	}

}
