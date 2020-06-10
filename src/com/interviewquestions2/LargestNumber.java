package com.interviewquestions2;

public class LargestNumber {

	public static void main(String[] args) {
		int largest=0;
		
		int[] arr= {1,2,3,46,5,6};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) { //1>0   2>1  3>2 46>3  5>46 6>46
				largest=arr[i];   //46
			}
			
		}
		
		System.out.println(largest);
	}

}
