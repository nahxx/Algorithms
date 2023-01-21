package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main7 {

	public static void main(String[] args) throws IOException {
		// 내림차순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int[] arr = new int[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(str.charAt(i) - 48);
		}
		desc(arr);
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] desc(int[] arr) {
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
}
