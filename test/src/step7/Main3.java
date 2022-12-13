package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(n != 0) {
			n -= (n-1);
			cnt++;
		}
		
		
		/*
		String[] arr = new String[Integer.parseInt(br.readLine())];
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) continue;
			cnt++;
			int n1 = 0;
			int n2 = 0;
			for(int j = 0; j < cnt - 1; j++) {
				if(cnt % 2 == 0) {
					n2 = j + 1;
					n1 = cnt - n2;
				} else {
					n1 = j + 1;
					n2 = cnt - n1;
				}
				
				arr[i+j] = n1 + "/" + n2;
				
				System.out.println(arr[i+j]);
				if(i+j == arr.length - 1) {
					break;
				}
			}
			
		}
		
		System.out.println(arr[arr.length-1]);
		*/
	}

}
