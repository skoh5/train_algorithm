package com.skoh5.day2;

public class CountPY {
	
	boolean solution(String s) {
		boolean answer = true;
		s = s.toLowerCase();
		int yNum = 0, pNum = 0;
		char c;
		for(int i=0;i<s.length();i++) {
			c = s.charAt(i);
			if(c == 'y') {
				yNum++;
				continue;
			}
			if(c == 'p') {
				pNum++;
				continue;
			}
		}
		if(pNum != yNum) {
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		new CountPY().solution(args[0]);
	}
}
