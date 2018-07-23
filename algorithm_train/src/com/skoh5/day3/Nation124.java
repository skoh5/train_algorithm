package com.skoh5.day3;

import java.util.ArrayList;
import java.util.List;

public class Nation124 {
	public String solution(int n) {
		String answer = "";
		List<Integer> listInt = new ArrayList<>();
		while(n > 2) {
			listInt.add(n%3);
			n = n/3;
		}
		listInt.add(n);
		StringBuffer strBuf = new StringBuffer();
		for(int i=listInt.size()-1;i>=0;i--) {
			strBuf.append(listInt.get(i));
		}
		answer = strBuf.toString();
		return answer;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//code
		System.out.println(new Nation124().solution(Integer.parseInt(args[0])));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms");
	}

}
