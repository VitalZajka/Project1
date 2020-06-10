package com.interviewquestionsR;

//We will be solving interview questions under this package

public class StringReverse {

	public static void main(String[] args) {

		String word = "sad";
		String reverse="";
		for(int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);			
		}
		System.out.println(reverse);
		
		//reverse("sad");

//		String b = "hafsa";
//		for (int i = b.length() - 1; i >= 0; i--) {
//			System.out.print(b.charAt(i));
//		}

	}

	public static void reverse(String name) {

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}

	}
}