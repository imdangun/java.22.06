package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.println("1.가위, 2.바위, 3.보\n> ");		
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			switch (playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			
			switch(playerChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 중의 하나를 입력하세요.";
		}
		
		System.out.println(result);
	}
}
/*
과제] 앱과 가위바위보를 하라.
게임 결과를 알려준다.
결과는
You win.
You Lose.
Fair.
중의 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/