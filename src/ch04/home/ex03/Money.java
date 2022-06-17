package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0; // 손에 쥔 돈
		int tmp = 0; // 꺼낸 돈
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000;
			System.out.println(tmp);
			tot += tmp;
		}
		
		System.out.printf("\n%d원을 꺼냈습니다.", tot);
	}
}
/*
과제] 3만원짜리 물건값을 치뤄라.

지갑에 5만원권은 없다.
꺼낸 돈의 권(종류)을 구별하지 않는다.
지갑에서 지폐를 여러번 꺼낸다.
한번에 3만원 이하를 꺼낸다.
꺼낼때마다, 꺼낸 금액을 출력한다.
--

12000
2000
6000
10000

30000원을 꺼냈습니다.
*/