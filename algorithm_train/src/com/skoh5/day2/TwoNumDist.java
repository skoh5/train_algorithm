package com.skoh5.day2;

public class TwoNumDist {

	public long solution(int a, int b) {
		long answer = 0;
		if(a == b) {
			return a;
		}
		int startNum = 0, endNum = 0;
		if(a > b) {
			startNum = b;
			endNum = a;
		} else {
			startNum = a;
			endNum = b;
		}
		while(startNum <= endNum) {
			answer += startNum++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		new TwoNumDist().solution(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
