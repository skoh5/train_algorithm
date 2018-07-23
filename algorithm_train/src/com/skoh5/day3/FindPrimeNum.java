package com.skoh5.day3;

public class FindPrimeNum {
	public int solution(int n) {
		int answer = 0;
		java.util.Set<Integer> setMultiple = new java.util.HashSet<>(n);		
		for(int i=2;i<=n;i++) {
			if(setMultiple.contains(i)) {
				continue;
			}
			answer++;
			addMultiple(i, n, setMultiple);			
		}		
		return answer;
	}
	
	private void addMultiple(int num, int maxNum, java.util.Set<Integer> setMultiple) {
		int multipleIdx = 1;
		int findNum = num * multipleIdx++;
 		while(findNum <= maxNum) {
 			if(setMultiple.contains(findNum) == false) {
 				setMultiple.add(findNum);
 			}
			findNum = num * multipleIdx++;
		}
	}
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		//code
		System.out.println(new FindPrimeNum().solution(Integer.parseInt(args[0])));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms");
	}
}
