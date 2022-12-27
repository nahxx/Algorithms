package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 피보나치 수열 재귀함수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(fibonacci(0, 1, n) + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int cnt = 1;
	public static int fibonacci(int n1, int n2, int n) {
		if(n == 0) return 0;
		if(cnt++ == n) return n2;
		return fibonacci(n2, (n1 + n2), n);
	}
}
