package programous;

import java.util.Arrays;


class Solution {
	public static void main(String[] args) {
		solution("aaaaa","bbbbb");
		
	}
	public static String solution(String str1, String str2) {
		for(int i = 0; i<str1.length();i++) {
			char a = str1.charAt(i);
			char b = str2.charAt(i);
			String x = Character.toString(a);
			String y = Character.toString(b);
			String result =x+y;			
		}
		return "";
		
		
	}
}


