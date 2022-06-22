package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("¦");
			if(ones != 0 && ones % 3 == 0) System.out.print("¦");
			
			if(i % 10 == 0) System.out.println();
		}
	}
}
/*
����] 369 ������ �϶�.
���ڴ� 1�̻� 99�����̴�.
10���� �ٹٲ��� �Ѵ�.
--

 1 2 3¦ 4 5 6¦ 7 8 9¦ 10
 11 12 13¦ 14 15 16¦ 17 18 19¦ 20
 21 ...
 91¦ 92¦ 93¦¦ 94¦ 95¦ 96¦¦ 97¦ 98¦ 99¦¦ 
*/