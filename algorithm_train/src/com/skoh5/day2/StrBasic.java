package com.skoh5.day2;

public class StrBasic {
	public boolean solution(String s) {
		boolean answer = true;
		int len = s.length();
		if(len != 4 && len != 6) {
			return false;
		}
		try {
			Integer.parseInt(s);			
		} catch (NumberFormatException ne) {
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		new StrBasic().solution(args[0]);
	}
}
