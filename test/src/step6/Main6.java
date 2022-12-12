package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}

}
