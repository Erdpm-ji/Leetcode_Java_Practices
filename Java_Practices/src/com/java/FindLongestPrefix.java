package com.java;

import java.util.Arrays;

public class FindLongestPrefix {
	public static void main(String[] args) {
		String [] strs = {"flower","flow","flight"};
		System.out.println(longestPrefix(strs));
		
		String [] str1 = {"dog","deepak","deepika", "d"};
 		System.out.println(longestPrefix(str1));
 		System.out.println(longestCommonPrefix(str1));
 		
 		String [] str2 = {""};
 		System.out.println(longestPrefix(str2));
 		
 		String [] str3 = {"deepak","dee","d"};
 		System.out.println(longestPrefix(str3));
	}
	
	public static String longestPrefix(String [] strs) {
		String prefix = "";
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<strs.length;i++) {
			if(strs[i].length()<min) {
				min = strs[i].length();
			}
		}
		String temp = strs[0];
		boolean flag = true;
		for(int i = 0; i <min; i++) {
			for(int j=1;j<strs.length; j++) {				
				if(temp.charAt(i)!=strs[j].charAt(i)) {
					flag = false;
				}
			}
			if(flag == false) {
				break;
			}else {
				  prefix += temp.charAt(i);
			}	
		}	
		return prefix; 
	}
	
	public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
