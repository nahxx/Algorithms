package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main5 {
	
	// 최댓값 구하기
	public static int getMaxNum(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
	
	// 배열 값 누적
	public static int[] prefixSum(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		return arr;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 카운팅 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int[] result = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] counting = new int[getMaxNum(arr) + 1];
		
		// arr[i] 값이 인덱스인 counting 배열에 +1
		for(int i = 0; i < arr.length; i++) {
			counting[arr[i]] += 1;
		}
		
		// counting 배열 각 요소 누적합 구하기
		prefixSum(counting);
		
		// result에 값 넣기
		for(int i = arr.length - 1; i > -1; i--) {
			if(counting[arr[i]] != 0) {
				counting[arr[i]] -= 1;
				result[counting[arr[i]]] = arr[i];
			}
		}
		
		// 출력
		for(int n : result) {
			bw.write(n + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
