package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("����ұ��(y/n)? ");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat == 'y');
		
		System.out.println("��.");
	}
}
/*
����] ���⸦ ������.
�����ڴ� +, -, *, / �̴�.
/ �� ���� ��´�.

����ó�� ���Ѵ�.
--

a: 1
op: +
b: 2
1 + 2 = 3
����Ͻðڽ��ϱ�(y/n)? y
a: 2
op: *
b: 3
2 * 3 = 6
����Ͻðڽ��ϱ�(y/n)? n
��.
*/