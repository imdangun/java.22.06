package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("메세지: ");
		paper.setMsg(sc.nextLine());
		System.out.print("작성자명: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());
	}
}
/*
과제] 종이에 메세지와 작성자명을 기록하라.
--

메세지: hello
작성자명: terry

hello from terry.
*/
