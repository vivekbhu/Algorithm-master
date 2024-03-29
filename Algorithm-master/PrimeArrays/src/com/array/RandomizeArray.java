/**
 * 
 */
package com.array;

import java.util.Random;

/**
 * @author Vivek Srivastava
 * This program will take any Object array and randomizes 
 * the array elements order using Pseudo Random Number generator
 * (https://en.wikipedia.org/wiki/Pseudorandom_number_generator)
 */
public class RandomizeArray {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Object input[] = new Object[]{"1","2","3","4","5"};
		randomizeArray(input);
	}
	
	private static Object[] randomizeArray(Object[] input){
		System.out.println("------Original below_______");
		printArray(input);
		Random ran = new Random();
		int size = input.length;
		for(int i=0;i<size;i++){
			/* For any item with index i swap with item with 
			 * random index which is Random number from 0 to arraylength-1 */
			int j = ran.nextInt(size-1);
			//System.out.println(String.format("Exchanging elements between index %s & %s",i,j));
			//Exchanging values between i & j index
			Object temp = input[i];
			input[i]=input[j];
			input[j]=temp;
		}
		System.out.println("\n------Randmized below_______");
		printArray(input);
		
		return null;
	}
	
	private static void printArray(Object[] input){
		for(Object each:input){
			System.out.print(String.format("[%s],",each.toString()));
		}
	}

}
