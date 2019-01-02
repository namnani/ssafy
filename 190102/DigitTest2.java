package com.ssafy.java;

public class DigitTest2 {
	public static void main(String[] args) {
		int n = 1;
		
		for(int i = 1; i<=3; i++) {
			for(int j = 2; j<=i; j++) {
				System.out.print("\t");
			}
			for(int j = i; j<=6-i; j++) {
				System.out.print(n++ + "\t");
			}
			System.out.println();
		}
		
		for(int i = 4; i<=5; i++) {
			for(int j = 1; j<=5-i; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j<=1+(i-3)*2; j++) {
				System.out.print(n++ + "\t");
			}
			System.out.println();
		}
	}
}
