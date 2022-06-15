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
		
		System.out.println("=> a, b ���� ��ü�մϴ�.");
		int temp = 0;  // business logic
		temp = a; // backup
		a = b;
		b = temp;
		System.out.printf("=> a: %d, b: %d\n", a, b);		
	}
}
/*
����] a, b ������ ���� ��ü�϶�.

a�� b���� ���Ƿ� �Է� �޴´�.
��ü ����� ����Ѵ�.
*/