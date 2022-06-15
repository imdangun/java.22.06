package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// presentation logic
		int a = sc.nextInt();
		System.out.print("a: "); 
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a, b 값을 교체합니다.");
		int temp = 0;  // business logic
		temp = a; // backup
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d\n", a, b);		
	}
}
/*
과제] a, b 변수의 값을 교체하라.

a와 b값을 임의로 입력 받는다.
교체 결과를 출력한다.
*/