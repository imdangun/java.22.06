package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
		
		System.out.print("�̸�: ");
		name = sc.nextLine();
		System.out.print("����: ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n�̸�: %s\n����: %d\n������: %s", 
				user.getName(), user.getAge(), user.getRegDate());
	}
}
/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� ���� �Է� �޴´�.
�������� ���� ��¥�� �ڵ� �Է� �޴´�.
--

�̸�: gambit
����: 25

�̸�: gambit
����: 25
������: 2022-06-21
*/