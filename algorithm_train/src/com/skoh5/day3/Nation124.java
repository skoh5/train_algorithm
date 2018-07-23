package com.skoh5.day3;

import java.util.ArrayList;
import java.util.List;

public class Nation124 {
	public String solution(int n) {
		String answer = "";
		final int[] arrNum = {4, 1, 2};
		List<Integer> listInt = new ArrayList<>();
		int div = 0;
		while(true) {			
			listInt.add(arrNum[n%3]);
			div = (n-1)/3;
			n = div;
			if(div <= 3) {
				break;
			}
		}
		if(n > 0) {
			listInt.add(arrNum[n%3]);
		}
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
