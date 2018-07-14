package com.skoh5.day2;

public class SortString {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		String[] arrSort = new String[strings.length];
		for(int i=0;i<strings.length;i++) {
			arrSort[i] = strings[i].charAt(n)+strings[i];
		}
		java.util.Arrays.sort(arrSort);
		answer  = new String[arrSort.length];
		for(int i=0;i<arrSort.length;i++) {
			answer[i] = arrSort[i].substring(1);
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] arrStr = new String[args.length-1];
		System.arraycopy(args, 0, arrStr, 0, args.length-1);
		new SortString().solution(arrStr, Integer.parseInt(args[args.length-1]));
	}
}
