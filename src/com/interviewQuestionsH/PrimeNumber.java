package com.interviewQuestionsH;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num=5;
		boolean prime=true;
		if(num>2) {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					prime=false;
					break;
				}
			}
		}else {
			prime=false;
			
		}
		System.out.println(num+" is prime? "+prime);
	}

}
