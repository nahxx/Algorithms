package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {
	static int cnt = 0;
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		// 체스판 다시 칠하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];

		for(int i = 0; i < arr.length; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				check(i, j, arr[i][j]);
			}
		}
		
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void check(int i, int j, char c) {
		/*
		 i랑 j가 0인 경우 -> 오른쪽(j+1), 아래(i+1)만 확인
		 i가 0이고, j가 length - 1인 경우 -> 왼쪽(j-1), 아래(i+1)만 확인
		 i가 0인 경우 -> 왼쪽(j-1), 오른쪽(j+1), 아래(i+1)만 확인
		 
		 i가 length - 1이고, j가 0인 경우 -> 오른쪽(j+1), 위(i-1)만 확인
		 i랑 j가 length - 1인 경우 -> 왼쪽(j-1), 위(i-1)만 확인
		 i가 length - 1인 경우 -> 왼쪽(j-1), 오른쪽(j+1), 위(i-1)만 확인
		 
		 나머지 -> 왼쪽(j-1), 위(i-1), 오른쪽(j+1), 아래(i+1) 전체 확인
		 
		 c와 겹치면 cnt++
		 */
		if(i == 0) {
			if(j == 0) {
				
			} else if(j == arr[i].length - 1) {
				
			} else {
				
			}
		} else if(i == arr[i].length - 1) {
			if(j == 0) {
							
			} else if(j == arr[i].length - 1) {
				
			} else {
				
			}
		} else {
			
		}
	}
}
