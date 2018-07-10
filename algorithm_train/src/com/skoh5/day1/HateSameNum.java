package com.skoh5.day1;

import java.util.ArrayList;
import java.util.List;

public class HateSameNum {
	public int[] solution(int []arr) {
		int[] answer = {};
		int prevNum = -1;		
		List<Integer> arrNum = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == prevNum) {
				continue;
			}
			arrNum.add(arr[i]);
			prevNum = arr[i];
		}
		answer = new int[arrNum.size()];
		int i=0;
		for(int num: arrNum) {
			answer[i++] = num;
		}
		return answer;
	}
	
	public int[] solution2(int []arr) {
		int[] answer = {};
		int prevNum = -1;		
		int size =0;
		int[] tmp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == prevNum) {
				continue;
			}
			tmp[size++] = arr[i];
			prevNum = arr[i];
		}
		answer = new int[size];
		System.arraycopy(tmp, 0, answer, 0, size);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arrInt = new int[args.length];
		for(int i=0;i<args.length;i++) {
			arrInt[i] = Integer.parseInt(args[i]);
		}
		new HateSameNum().solution2(arrInt);
	}	
}
