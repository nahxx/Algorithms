package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		int max = Math.max(s1.length(), s2.length());
		int[] arr = new int[max + 1];
		
		for(int i = max - 1; i > -1; i--) {
			arr[i+1] = s1.charAt(i) - '0';
		}
		
		max = arr.length - 1;
		
		for(int i = s2.length() - 1; i > -1; i--) {
			System.out.println(arr[max] + " " + (s2.charAt(i) - '0'));
			int n = arr[max] + (s2.charAt(i) - '0');
			if(n > 9) {
				arr[max] = n % 10;
				arr[max-1] += n / 10;
			} else {
				arr[max] = n;
			}
			max--;
		}
		
		for(int n : arr) {
			System.out.print(String.valueOf(n));
		}
		
		/*
		// BigInteger 사용하여 풀이
		BigInteger n = new BigInteger(st.nextToken());
		n = n.add(new BigInteger(st.nextToken()));
		System.out.println(n);
		*/
	}

}
