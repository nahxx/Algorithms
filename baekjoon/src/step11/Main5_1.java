package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5_1 {
	static String[][] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new String[n][n];
		
		star(0, 0, n);
		
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
	
	public static void star(int x, int y, int n) {
		if(n == 3) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					if(i == x + 1 && j == y + 1) {
						arr[i][j] = " ";
					} else {
						arr[i][j] = "*";
					}
				}
			}
			return;
		}
		
		for(int i = x; i < x + n; i += n/3) {
			for(int j = y; j < y + n; j += n/3) {
				if((i == x + (n/3)) && (j == y + (n/3))) {
					for(int a = i; a < i + (n/3); a++) {
						for(int b = j; b < j + (n/3); b++) {
							arr[a][b] = " ";
						}
					}
					continue;
				}
				star(i, j, n/3);
			}
		}
	}
}
