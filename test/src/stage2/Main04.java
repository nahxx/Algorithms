package stage2;

import java.util.Scanner;

public class Main04 {
	
	public static void main(String[] args) {
		// 1사분면 ++ 2사분면 -+ 3사분면 -- 4사분면 +-
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = 0;
		if(x > 0 && y > 0) {
			n = 1;
		} else if(x < 0 && y > 0) {
			n = 2;
		} else if(x < 0 && y < 0) {
			n = 3;
		} else if(x > 0 && y < 0) {
			n = 4;
		}
		System.out.println(n);
	}
	
}
