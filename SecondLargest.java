package com.Test;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] array = {1,1,5,63,31,1,43};
		Arrays.sort(array);
		for(int i=1;i<array.length;i++) {
			if(array[i]!=array[0]) {
				System.out.println(array[i]);
				break;
			}
		}
	}

}
