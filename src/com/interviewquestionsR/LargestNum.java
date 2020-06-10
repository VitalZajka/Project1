package com.interviewquestionsR;

public class LargestNum {

	public static void main(String[] args) {

//		int[] nums = { 22, 100, 43, 11, 0 };
//		int largest = 0;

//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > largest) {//22>0	100>22 43>100 11>100  0>100		
//				largest = nums[i];//22	100			
//			}
//		}
//		System.out.println("The largest num is "+largest);

		
		//or
		int[] array = { 22, 100, 43, 11, 0 };//dfmsldv
		int max = array[0];
		for(int i: array) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The largest num is "+max);
			
	}
}