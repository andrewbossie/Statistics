/*
 * Andrew Bossie 
 */

import java.util.*;

public class Statistics {

	
	static int average;															//initialize variables
	int deviation;
	int input;
	int sum;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Here I will ask you to enter 7 numbers and I will compute the mean and standard deviation");
		
		int[] mathTable  = new int[7];
		
		for (int i = 0; i < mathTable.length; i++){								//add inputs into array
			System.out.print("Please enter a number: ");
			mathTable[i] = scan.nextInt();
		}
		
		average(mathTable);
		deviation(mathTable);

	}

	
	public static double average(int mathTable[]){								//calculate average
		int sum = 0;
		
		for (int i = 0; i < mathTable.length; i++ ){
			sum = sum + mathTable[i];
		}
		
		double average = sum / mathTable.length;
		
		System.out.println("The average is: " +average);
				
		return average;
	}
	
	public static double deviation(int mathTable[]){							//calculate deviation
		double sum1 = 0;
		double sum2 = 0;
		double deviation = 0;
		
		for (int i = 0; i < mathTable.length; i++ ){
			sum1 = mathTable[i];
			sum2 = Math.pow(mathTable[i], 2);
			deviation = Math.sqrt(i * sum2 - Math.pow(sum1, 2)) / i; 
		}
		
		System.out.println("The deviation is: " +deviation);
				
		return deviation;
	}
	
}