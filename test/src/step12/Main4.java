package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {
	static int min = 64;
	static boolean[][] arr;
	
	public static void main(String[] args) throws IOException {
		// 체스판 다시 칠하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new boolean[n][m];

		for(int i = 0; i < arr.length; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int n2 = n - 7;
		int m2 = m - 7;
		
		for(int i = 0; i < n2; i++) {
			for(int j = 0; j < m2; j++) {
				find(i, j);
			}
		}
		
		bw.write(min + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void find(int x, int y) {
		int endX = x + 8;
		int endY = y + 8;
		int cnt = 0;
		boolean color = arr[x][y]; // 첫칸 색
		
		for(int i = x; i < endX; i++) {
			for(int j = y; j < endY; j++) {
				// 올바른 색이 아닌 경우 cnt 추가
				if(arr[i][j] != color) cnt++;
				// 다음칸은 색이 바뀌므로 true는 false로, false는 true로 변경
				color = !color;
			}
			color = !color;
		}
		
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(cnt)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의 색칠 할 개수(64 - cnt) 중 
		 *  최솟값을 cnt 에 저장
		 */
		cnt = Math.min(cnt, 64 - cnt);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 cnt 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, cnt);
	}
}
