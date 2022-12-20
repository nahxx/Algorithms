package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			int n = Integer.parseInt(st.nextToken());
			ArrayList<Integer> list = new ArrayList<Integer>();
			if(n > 1) {
				for(int j = 1; j < n + 1; j++) {
					if(n % j == 0) {
						list.add(j);
					}
				}
				if(list.size() == 2 && list.get(1) == n) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
