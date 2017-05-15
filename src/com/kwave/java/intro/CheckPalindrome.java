package com.kwave.java.intro;

import java.util.Scanner;

public class CheckPalindrome {
	
	public boolean Palindrome1(String inputString) {
		
		char[] candi = new char[inputString.length()];
		boolean check = true;
		String palindrome = null;
		
		int abc = 1;
		for(int i =0; i<inputString.length()/2;i++){
			if(inputString.charAt(i)!=inputString.charAt(inputString.length()-1-i)){
				abc = 0;
				}
					
			}
		if(abc == 0)
			{
			System.out.println("False");
				return false;
			}
		else{			
			System.out.println("True");
			return true;
		}

	}		

}
