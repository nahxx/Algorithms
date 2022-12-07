package step3;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		/*
		첫째 줄에는 영수증에 적힌 총 금액 $X$가 주어진다.

		둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 $N$이 주어진다.

		이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.
		*/
		
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int cnt = sc.nextInt();
		int check = 0;
		
		for(int i = 0; i < cnt; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			check += price * count;
		}
		if(sum == check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
