package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 평균, 중간값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[5];
		int avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i];
		}
		avg /= arr.length;
		
		arr = asc(arr);
		
		sb.append(avg + "\n").append(arr[2]);
		bw.write(sb + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int[] asc(int[] arr) {
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
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
