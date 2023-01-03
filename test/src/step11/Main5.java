package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5 {
	static char[][] arr;

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
		arr = new char[n][n];
		
		drawStar(0, 0, n, false);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				bw.write(arr[i][j] + "");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void drawStar(int x, int y, int n, boolean blank) {
		if(blank) {
			// 공백일 경우
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// 더이상 블록을 쪼갤 수 없을 때
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		/* 
		N=27 일 경우 한 블록의 사이즈는 9이고,
		N=9 일 경우 한 블록의 사이즈는 3이듯
		해당 블록의 한 칸을 담을 변수를 의미 size
	    
		cnt는 별 출력 누적 합을 의미하는 변수
		*/
		int size = n / 3;
		int cnt = 0;
		
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				cnt++;
				if(cnt == 5) {
					drawStar(i, j, size, true);
				} else {
					drawStar(i, j, size, false);
				}
			}
		}
	}

}
