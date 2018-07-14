package com.skoh5.day2;

public class FindKim {
	public String solution(String[] seoul) {
		String answer = "";
		final String FMT_ANSWER = "김서방은 %d에 있다";
		final String strFind = "Kim";
		int idx = 0;
		for(int i=0;i<seoul.length;i++) {
			if(strFind.equals(seoul[i])) {
				idx = i;
				break;
			}
		}
		answer = String.format(FMT_ANSWER, idx);
		return answer;
	}
	public static void main(String[] args) {
		new FindKim().solution(args);
	}
}
