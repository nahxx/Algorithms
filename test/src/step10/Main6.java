package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
			중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
			최빈값 : N개의 수들 중 가장 많이 나타나는 값
			범위 : N개의 수들 중 최댓값과 최솟값의 차이
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		
		int average = 0;
		int median = 0;
		int mode = 0;
		int range = 0;
		
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		average = (int) Math.round(sum / arr.length);
		
		Arrays.sort(arr);
		
		median = arr[arr.length / 2];
		range = arr[arr.length - 1] - arr[0];
		
		boolean flag = false;
		int mode_max = 0;

		for(int i = 0; i < arr.length; i++) {
			int jump = 0;
			int cnt = 1;
			int i_value = arr[i];
			
			for(int j = i + 1; j < arr.length; j++) {
				if(i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(cnt > mode_max) {
				mode_max = cnt;
				mode = i_value;
				flag = true;
			} else if(cnt == mode_max && flag == true) {
				System.out.println("mode: " + mode);
				mode = i_value;
				flag = false;
				System.out.println("mode2: " + mode);
			}
			
			i += jump;
		}
		
		bw.write(average + "\n");
		bw.write(median + "\n");
		bw.write(mode + "\n");
		bw.write(range + "\n");
		
		bw.flush();
		bw.close();
		br.close();
	}

}
