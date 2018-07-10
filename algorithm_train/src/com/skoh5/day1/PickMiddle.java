package com.skoh5.day1;

public class PickMiddle {

	public String solution(String s) {
		String answer = "";
		int idx = s.length()/2;
		if(s.length() % 2 == 0) {
			answer = s.substring(idx-1, idx+1);
		} else {
			answer = s.substring(idx, idx+1);
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		new PickMiddle().solution(args[0]);
	}
}
