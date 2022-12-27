package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 팩토리얼 재귀함수 사용2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(fac(n) + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int fac(int n) {
		if(n == 0) return 1;
		return n * fac(n-1);
	}
}
