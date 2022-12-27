package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 피보나치 수열 재귀함수2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(fibonacci(n) + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int fibonacci(int n) {
		if(n < 2) return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
