package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String in_val = sc.nextLine();  snake case
		//����] <�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�.
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		*/
		/*
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.println(i + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i2 = sc.nextInt(); sc.nextLine();
		System.out.println(i2 + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();		
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		*/
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
	}
}
