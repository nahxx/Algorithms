package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 색종이 붙은 면적 넓이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[100][100];
		StringTokenizer st;
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j = x - 1; j < x + 9; j++) {
				for(int k = y - 1; k < y + 9; k++) {
					if(!arr[j][k]) {
						arr[j][k] = true;
						result++;
					}
				}
			}
		}
		/*
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]) result++;
			}
		}
		*/
		System.out.println(result);
	}

}
