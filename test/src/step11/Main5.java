package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5 {
	static String star = "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 별찍기
		 	N은 3의 거듭제곱
			N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태
			크기 3의 패턴
			***
			* *
			***
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		String s = star(n);
		System.out.print(s);
		
		/*
		int[][] arr = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int check = n / 3;
				if((i > (check - 1) && i < (check * 2)) && (j > (check - 1) && j < (check * 2))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
	}
	
	public static String star(int n) {
		while(n >= 3) {
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					int check = n / 3;
					if((i > (check - 1) && i < (check * 2)) && (j > (check - 1) && j < (check * 2))) {
						star += " ";
					} else {
						star += "*";
					}
				}
				star += "\n";
			}
			
			n /= 3;
		}
		return star;

	}

}
