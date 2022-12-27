package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 팩토리얼 재귀함수 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int result = 1;
		result = factorial(n, result);
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int factorial(int n, int result) {
		if(n == 0) return result;
		result *= n;
		return factorial(--n, result);
	}
}
