package com.ssafy.java;

public class DigitTest1 {
	public static void main(String[] args) {
		int n = 1;
		
		for(int i = 1; i<=5; i++) {
			for(int j = 2; j<=i; j++) {
				System.out.print("\t");
			}
			for(int j = i; j<=5; j++) {
				System.out.print(n++ + "\t");
			}
			System.out.println();
		}
	}
}
