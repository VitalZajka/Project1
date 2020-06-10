package com.interviewquestions2;

public class ReverseString {

	public static void main(String[] args) {
		String originWord = "awesome";

		for (int i = originWord.length() - 1; i >= 0; i--) {
			System.out.print(originWord.charAt(i));
		}
	}
}
