package stage2;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		// 45분 일찍
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
		if(m < 0) {
			m = 60 + m;
			if(h == 0) {
				h = 23;
			} else {
				h--;
			}
		}
		System.out.println(h + " " + m);
	}

}
