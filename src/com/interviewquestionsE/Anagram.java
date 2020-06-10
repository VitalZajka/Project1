package com.interviewquestionsE;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String anagram="dog";
		
		for (int i=0; i<anagram.length(); i++) {
		
		char  c=anagram.charAt(i);
		//System.out.println(c);
		
	
		}
		
		char[] arr= {'d', 'o', 'g'};
		Arrays.sort(arr);
		System.out.println(arr);
		
		
		char newW=arr[1];
		System.out.println(newW);
	}

}
