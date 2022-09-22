package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Input a number");
		int n = in.nextInt();
		
		boolean booleanArray[]; //declaring array
			booleanArray = new boolean [n+1];
			
			for (int i = 0; i <= booleanArray.length; i++) {
				if (i == 2 || i == 3 || i == 5 || i == 7 || i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 ) {
					booleanArray [i] = true;
				System.out.println("" + i);
				}
//				else {
//				if (i % 3 != 0 ) {
//					booleanArray [i] = true;
//				System.out.println("" + i);
//				}
//				else {
//				if (i % 5 != 0 ) {
//					booleanArray [i] = true;
//				System.out.println("" + i);
//				}
//				else {
//				if (i % 7 != 0) {
//					booleanArray [i] = true;
//				System.out.println("" + i);
				}
							
			

	}

}

