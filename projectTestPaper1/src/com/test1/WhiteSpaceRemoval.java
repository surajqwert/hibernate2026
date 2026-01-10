package com.test1;

public class WhiteSpaceRemoval {

	public static void main(String[] args) {
		
		String str = "Java Full Stack Developement"; 
		
		StringBuffer str1 = new StringBuffer();

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') continue;
			
			str1.append(str.charAt(i));
		}
		System.out.println(str1);
		
	}

}
