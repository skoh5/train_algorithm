package com.skoh5.day3;

public class CaesarCipher {
	public String solution(String s, int n) {
		
		String answer = "";
		char[] arrChar = s.toCharArray();
		for(int i=0;i<arrChar.length;i++) {
			arrChar[i] = pushChar(arrChar[i], n);
		}
		answer = new String(arrChar);
		return answer;
	}
	
	private char pushChar(char c, int n) {
		final int I_a = (int)'a';
		final int I_z = (int)'z';
		final int I_A = (int)'A';
		final int I_Z = (int)'Z';
		final int I_SPACE = (int)' ';
		int i = (int)c;
		if(i == I_SPACE) {
			return c;
		} else if(i >= I_a && i <= I_z) {
			i = i+n;
			if(i > I_z) {
				i = I_a + (i - I_z) - 1 ;
			}
			c = (char)i;
		} else if(i >= I_A && i <= I_Z) {
			i = i+n;
			if(i > I_Z) {
				i = I_A + (i - I_Z) - 1 ;
			}
			c = (char)i;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(new CaesarCipher().solution(args[0], Integer.parseInt(args[1])));
	}
}
