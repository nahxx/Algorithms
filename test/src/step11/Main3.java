package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			int[] arr = isPalindrome(br.readLine());
			bw.write(arr[0] + " " + arr[1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] recursion(String s, int left, int right, int count) {
		if(left >= right) return new int[] {1, count};
		else if(s.charAt(left) != s.charAt(right)) return new int[] {0, count};
		else return recursion(s, left + 1, right - 1, ++count);
	}
	
	public static int[] isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1, 1);
	}
}
