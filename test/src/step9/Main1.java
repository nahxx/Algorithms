package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// 두 행렬 더한 값 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < arr[j].length; k++) {
					arr[j][k] += Integer.parseInt(st.nextToken());
					if(i == 1) {
						sb.append(arr[j][k]).append(" ");
						if(k == arr[j].length - 1) {
							sb.append("\n");
						}
					}
				}
			}
		}
		System.out.println(sb);
	}

}
