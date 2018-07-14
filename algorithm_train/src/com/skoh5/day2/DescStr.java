package com.skoh5.day2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescStr {
	public String solution(String s) {
		String answer = "";
		List<Character> list = s.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		Collections.reverse(list);
		answer = list.stream().map(e->e.toString()).collect(Collectors.joining());
		return answer;
	}
	
	public String solution2(String s) {
		String answer = "";
		char[] arrChar = new char[s.length()];
		s.getChars(0, s.length(), arrChar, 0);
		java.util.Arrays.sort(arrChar);
		for(int i=arrChar.length-1;i>=0;i--) {
			answer += arrChar[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		new DescStr().solution2(args[0]);
	}
}
