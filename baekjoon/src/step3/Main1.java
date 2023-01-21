package step3;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ggd = "";
		
		for(int i = 1; i < 10; i++) {
			ggd += n + " * " + i + " = " + (n * i) + "\n";
		}
		System.out.println(ggd);
	}
	
}
