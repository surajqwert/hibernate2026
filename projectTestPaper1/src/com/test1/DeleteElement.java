package com.test1;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		int rem = 4;
		int index = -1;
			
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] ==rem) {
				index = i;
			}
		}
		
		
		if(index != 1) {
		for(int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
