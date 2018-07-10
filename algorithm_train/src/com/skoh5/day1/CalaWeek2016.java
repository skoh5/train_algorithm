package com.skoh5.day1;

public class CalaWeek2016 {

	private final int[] arrMonthDay = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
	private final String[] arrWeek = new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	public String solution(int a, int b) {
		String answer = "";
		int daysOfYear = b;
		for(int i=0;i<a-1;i++)
			daysOfYear += arrMonthDay[i];
		int idx = (daysOfYear+4) % 7;
		answer = arrWeek[idx];
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		new CalaWeek2016().solution(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
