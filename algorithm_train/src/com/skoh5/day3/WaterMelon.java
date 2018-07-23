package com.skoh5.day3;

public class WaterMelon {
	public String solution(int n) {
		String answer = "";
		String[] arrStr = {"¼ö", "¹Ú"};
		StringBuffer strBuf = new StringBuffer();
		for(int i=0;i<n;i++) {
			strBuf.append(arrStr[i%2]);
		}
		answer = strBuf.toString();
		return answer;
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//code
		System.out.println(new WaterMelon().solution(Integer.parseInt(args[0])));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms");
	}

}
