package com.skoh5.day3;

public class ToInteger {
	public int solution(String s) {
		int answer = 0;
		if(s.charAt(0) == '+') {
			answer = Integer.parseInt(s.substring(1));
		} else if(s.charAt(0) == '-') {
			answer = Integer.parseInt(s.substring(1)) * -1;
		} else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//code
		System.out.println(new FindPrimeNum().solution(Integer.parseInt(args[0])));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms");
	}

}
