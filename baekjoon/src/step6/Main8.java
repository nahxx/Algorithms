package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].contains(s)) {
					result += (j + 3);
				}
			}
		}
		System.out.println(result);
	}

}
