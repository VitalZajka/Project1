package com.interviewquestionsR;

public class SecondLargest {

	public static void main(String[] args) {

		// second largest
		int[] nums = { 22, 100, 43, 11, 0 };
		int largest = 0;
		int secondLargest = 0;
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > largest) {// 22.33>0 100.0>22.33 43>100.0 11>100.0 0>100.0
				secondLargest = largest;// 22.33 100
				largest = nums[i]; // 22.3 100 22.33 100.0
			} else if (nums[i] > secondLargest) {
				secondLargest = nums[i];
			} else if (nums[i] < min) {
				min = nums[i];
			}

		}

	}

//			System.out.println(secondLargest);
}
