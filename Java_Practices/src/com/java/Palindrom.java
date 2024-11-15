package com.java;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("121 isPalindrom " + isPalidrom(121));
        
    }
    public static boolean isPalidrom(int num){
        int original = num;
        int newNum = 0;
        boolean flag = false;
        while(original!=0){
            newNum = newNum * 10 + (original%10);
            original = original/10;
        }
        if(num==newNum){
            flag = true;
        }
        return flag;
    }

}
