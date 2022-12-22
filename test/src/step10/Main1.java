package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 수 오름차순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		arr = asc(arr);
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] asc(int[] arr) {
		int tmp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

}
