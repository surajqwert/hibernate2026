package com.test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(5);
		arr.add(3);
		arr.add(4);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		
		
		Set<Integer> hs = new HashSet<>();
		
		for(int s : arr) {
			if(hs.contains(s)) {
				System.out.println("First repeating element is " +s);
				break;
			}
			hs.add(s);
		}

	}

}
