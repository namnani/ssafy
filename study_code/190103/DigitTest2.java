//2019. 01. 04
//by nani

package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int temp1 = 100;
		int temp2 = input;
		System.out.print(temp1 + " ");
		System.out.print(temp2 + " ");
		while((temp1 - temp2) >= 0){
			int realTemp = temp1; 
			temp1 = temp2;
			temp2 = realTemp-temp2;
			System.out.print(realTemp-temp1 + " ");
		}
		 
		System.out.print(temp1-temp2 + " ");
	}
}
