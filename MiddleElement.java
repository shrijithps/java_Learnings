package com.mavenPractice;

public class MiddleElement {
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 1, 4 };

		int leftSum = array[0];
		int rightSum = 0;

		for (int i = 1; i < array.length; i++) {
			rightSum += array[i];
		}

		for (int i = 1; i < array.length; i++) {
			leftSum += array[i];
			if (leftSum == rightSum) {
				System.out.println("The middle index is "+i);
				break;
			}
			rightSum -= array[i];
		}
	}

}
