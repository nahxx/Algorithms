package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// A : 고정비용(매년), B : 가변비용(*생산대수), C : 노트북가격 / A + B < 총수입 되는 순간 손익분기점
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// a + (b * x) < (c * x)
		// a < (c - b) * i
		// a / (c - b) < i
		
		if(arr[2] <= arr[1]) {
			System.out.println(-1);
		} else {
			System.out.println(arr[0] / (arr[2] - arr [1]) + 1);
		}
	}

}
