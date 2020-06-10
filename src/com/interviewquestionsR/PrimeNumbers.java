package com.interviewquestionsR;
/*
 * prime number is diivisible only to 1 and itslef
 * 
 * 
 * */

public class PrimeNumbers {

	public static void main(String[] args) {

		int num =7;
		boolean isPrime=true;
		
		if(num>1) {//we say >1 bc prime num cant be negative
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		
		System.out.println("is "+num+" a prime numnber? "+isPrime);
	}
	

}
