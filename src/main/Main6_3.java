package main;

public class Main6_3 {

	public static void main(String[] args) {
		int num = 5;
		 
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		int i = 0;
		int j = 0;
		for (i=1; i<=num; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i=num; i>=1; i--) {
			for (j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		*			-> *
//		***			-> ** *
//		*****		-> *** **
//		*******		-> **** ***
//		*********	-> ***** ****
		for (i=1; i<=5; i++) {
			for(j=1; j<=(i+(i-1)); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
