package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[2];
		for(int i = 0; i < 2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i] = (arr[i] / 100) + (((arr[i] % 100) / 10) * 10) + ((arr[i] % 10) * 100);
		}
		System.out.println(arr[0] > arr[1] ? arr[0] : arr[1]);
	}
	
}
