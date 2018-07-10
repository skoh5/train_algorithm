package com.skoh5.day1;

import java.util.Arrays;

public class DivArray {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int[] tmp = new int[arr.length];
		int size = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % divisor != 0) {
				continue;
			}
			tmp[size++] = arr[i];
		}
		if(size ==0) {
			answer = new int[] {-1};
		} else {
			answer = new int[size];
			System.arraycopy(tmp, 0, answer, 0, size);
			java.util.Arrays.sort(answer);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arrInt = new int[args.length-1];
		for(int i=0;i<args.length-1;i++) {
			arrInt[i] = Integer.parseInt(args[i]);
		}
		new DivArray().solution(arrInt, Integer.parseInt(args[args.length-1]));
	}
}
