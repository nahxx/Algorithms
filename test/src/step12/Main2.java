package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// N의 가장 작은 생성자 구하기
		// N = M + M의 자리수 각각 더한 값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int length = (int)(Math.log10(n) + 1); // n의 길이
		int tmp = n - (9 * length) + 1; // 체크할 시작값
		
		if(tmp < 0) {
			tmp = 0;
		}
		for(int i = tmp; i <= n; i++) {
			int tmpNum = i;
			int[] arr = getArr(i);
			for(int j = 0; j < arr.length; j++) {
				tmpNum += arr[j];
			}
			if(tmpNum == n)  {
				bw.write(i + "");
				break;
			}
			if(i == n) bw.write(0 + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] getArr(int n) {
		int[] arr;
		if((int)(Math.log10(n) + 1) < 0) {
			arr = new int[1];
		} else {
			arr = new int[(int)(Math.log10(n) + 1)];
		}
		int i = 0;
		while(n > 0) {
			arr[i++] = n % 10;
			n /= 10;
		}
		return arr;
	}
}
