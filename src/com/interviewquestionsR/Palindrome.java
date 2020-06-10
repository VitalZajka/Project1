package com.interviewquestionsR;

public class Palindrome {

	public static void main(String[] args) {
		String word="dad";
		String reverse="";
		
		for(int i=word.length()-1; i>=0; i--) {
			reverse += word.charAt(i);
//			System.out.print(reverse);//we dont need this
		}
		
		if(reverse.equals(word)) {
			System.out.println("\nThe string is a palindrome " +reverse);
		}else {
			System.out.println("\nThe string is not a palindrome");
		}
		
		//listen the voice record and take note here
		
		//we have for loop we are looping thru backwards 
		//and inside our for block we adding the empty string to the each character
		//
		
	}
}
 