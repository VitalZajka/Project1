package com.interviewquestionsE;

public class PrimeNumbers {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 * 
		 * prime number is a number that is greater than 1
		 * prime number should meet 2 conditions(divisible by 1 and itself only)
		 * 2(1,2),3(2,3),5(2,3,4,5),7(2,3,4,5,6,7),11,13,17
		 * 
		 * not prime:4, 6 %i=0 false 
		 * 6?  
		 * 
		 */

		int givenNum=7;
		boolean isPrimeOrNot=true;
	
		if (givenNum>1) {
			for (int i=2; i<givenNum; i++) {
				if (givenNum%i==0) {
					isPrimeOrNot=false;
					break;
				}
			}
			
			
			
		} else { //here negative number not prime
			isPrimeOrNot=false;
		}
		
		System.out.println(givenNum+ " is Prime? "+ isPrimeOrNot);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int given = 10;
//		boolean isPrime=true;
//		
//		if(given>1) {
//			for(int i=2; i<given; i++) {
//				if(given%i==0) {
//					isPrime=false;
//					break;
//				}
//			}
//			
//		}else {
//			isPrime=false;
//		}
//		System.out.println("Given number "+given+" is prime? "+isPrime);
//		
	}
}
	

