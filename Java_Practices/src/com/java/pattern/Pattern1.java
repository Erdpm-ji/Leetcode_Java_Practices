package com.java.pattern;

public class Pattern1 {
	
	public static void main(String[] args) {
		sequarPattern(5);
		System.out.println();
		leftSideTriglePattern(5);
		System.out.println();
		leftSideNumberTriglePattern(5);
		System.out.println();
		leftSideSameNumberTriglePattern(5);
		System.out.println();
		leftSideReversStarTriglePattern(5);
		System.out.println();
		leftSideReversNumberTriglePattern(5);
		System.out.println();
		completeUpTringle(5);
		System.out.println();
		completeDownTringle(5);
	}
	
	public static void sequarPattern(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void leftSideTriglePattern(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void leftSideNumberTriglePattern(int n) {

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void leftSideSameNumberTriglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void leftSideReversStarTriglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void leftSideReversNumberTriglePattern(int n) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void completeUpTringle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+i-1;j++) {
				if((i+j)>5)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	public static void completeDownTringle(int n) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i+4;j++) {
				if(((i+j)<=5)) {
					System.out.print("   ");
				}else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}
