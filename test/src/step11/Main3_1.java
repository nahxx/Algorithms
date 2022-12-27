package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3_1 {
	static int cnt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수 (2)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			bw.write(isPalindrome(br.readLine()) + " " + cnt + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int recursion(String s, int left, int right) {
		cnt++;
		if(left >= right) return 1;
		else if(s.charAt(left) != s.charAt(right)) return 0;
		else return recursion(s, left + 1, right - 1);
	}
	
	public static int isPalindrome(String s) {
		cnt = 0;
		return recursion(s, 0, s.length() - 1);
	}
}
