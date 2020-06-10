package com.interviewquestionsE;

import java.util.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		//1 way
		int[] arr = { 50, 40, 3, 46, 5, 6, 9 }; // { 3, 5, 6, 40, 46, 50 }
		Arrays.sort(arr);                   //      [0] [1] 2   3  [4] [5] 
		System.out.println("small "+arr[0]);
		System.out.println("bigest "+arr[arr.length-1]);  //[5]
		System.out.println("2bigest "+arr[arr.length-2]); //[4]
		System.out.println("2 smallest"+arr[1]);
	
		
		
		int largest = arr[0]; //=0
		int secondlargest=arr[0];

		

		for (int i = 0; i < arr.length; i++) {  //arr[0] [1] 2 3 
			if (arr[i] > largest) { // 1>1 40>1 3>40 46>40 
				secondlargest=largest;//46
				largest = arr[i]; // 46
			} else if (secondlargest!=largest && arr[i]>secondlargest) {
				secondlargest = arr[i]; //40
			}

		}
		
		System.out.println("largest # "+largest);
		
		System.out.println("Second largest # "+secondlargest);
		
		//2 way
		
		int[] numbers = { 32, 61, 16, 89, 74, 25 };
	
		Arrays.sort(numbers);
		
		System.out.println("Smallest " + numbers[0]);
		System.out.println("Biggest " + numbers[numbers.length - 1]);
		System.out.println("Second Largest " + numbers[numbers.length - 2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
