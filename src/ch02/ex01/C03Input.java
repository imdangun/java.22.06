package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("문자열을 입력하세요.\n>");
		String in_val = sc.nextLine();  snake case
		//과제] <입력데이터>를 입력했습니다. 는 확인 메세지를 출력한다.
		System.out.printf("%s를 입력했습니다.", inVal);
		*/
		/*
		System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();
		System.out.println(i + "를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		int i2 = sc.nextInt(); sc.nextLine();
		System.out.println(i2 + "를 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n>");
		String inVal = sc.nextLine();		
		System.out.printf("%s를 입력했습니다.", inVal);
		*/
		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
	}
}
