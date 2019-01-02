package com.ssafy.java;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
//		System.out.println((int)(Math.random()*3)+1);
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.\n"
				+ "1. 5판 3승\n"
				+ "2. 3판 2승\n"
				+ "3. 1판 1승\n"
				+ "번호를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		sc.nextLine();
		int userWinCount = 0;
		int comWinCount = 0;
		int com = 0;
		int user = 0;
		if(inputNum == 1) {
			while(userWinCount != 3 && comWinCount != 3) {
				System.out.println("가위바위보 중 하나 입력: ");
				String str = sc.nextLine();
				if(str.equals("가위"))
					user = 1;
				else if(str.equals("주먹"))
					user = 2;
				else if(str.equals("보"))
					user = 3;
				else {
					System.out.println("제대로 다시 입력해 주세요.");
					continue;
				}
				com = (int)(Math.random()*3)+1;
				if(com == user) {
					System.out.println("비겼습니다. 재경기를 하겠습니다.");
				}
				else if(com > user || (com==1&&user==3)) {
					System.out.println("졌습니다!!!");
					comWinCount++;
				}
				else if(user > com || (user==1&&com==3)) {
					System.out.println("이겼습니다!!!");
					userWinCount++;
				}
			}
			if(userWinCount == 3) {
				System.out.println("### 유저 승!!!");
			} else if(comWinCount == 3) {
				System.out.println("### 컴퓨터 승!!!");
			}
		} else if(inputNum == 2) {
			while(userWinCount != 2 && comWinCount != 2) {
				System.out.println("가위바위보 중 하나 입력: ");
				String str = sc.nextLine();
				if(str.equals("가위"))
					user = 1;
				else if(str.equals("주먹"))
					user = 2;
				else if(str.equals("보"))
					user = 3;
				else {
					System.out.println("제대로 다시 입력해 주세요.");
					continue;
				}
				com = (int)(Math.random()*3)+1;
				if(com == user) {
					System.out.println("비겼습니다. 재경기를 하겠습니다.");
				}
				else if(com > user || (com==1&&user==3)) {
					System.out.println("졌습니다!!!");
					comWinCount++;
				}
				else if(user > com || (user==1&&com==3)) {
					System.out.println("이겼습니다!!!");
					userWinCount++;
				}
			}
			if(userWinCount == 2) {
				System.out.println("### 유저 승!!!");
			} else if(comWinCount == 2) {
				System.out.println("### 컴퓨터 승!!!");
			}
		} else if(inputNum == 3) {
			while(userWinCount != 1 && comWinCount != 1) {
				System.out.println("가위바위보 중 하나 입력: ");
				String str = sc.nextLine();
				if(str.equals("가위"))
					user = 1;
				else if(str.equals("주먹"))
					user = 2;
				else if(str.equals("보"))
					user = 3;
				else {
					System.out.println("제대로 다시 입력해 주세요.");
					continue;
				}
				com = (int)(Math.random()*3)+1;
				if(com == user) {
					System.out.println("비겼습니다. 재경기를 하겠습니다.");
				}
				else if(com > user || (com==1&&user==3)) {
					System.out.println("졌습니다!!!");
					comWinCount++;
				}
				else if(user > com || (user==1&&com==3)) {
					System.out.println("이겼습니다!!!");
					userWinCount++;
				}
			}
			if(userWinCount == 1) {
				System.out.println("### 유저 승!!!");
			} else if(comWinCount == 1) {
				System.out.println("### 컴퓨터 승!!!");
			}
		} else {
			System.out.println("잘못 고르셨습니다.");
		}
	}
}
