package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] alphabet = new int[26];
		for(int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 65] += 1;
		}
		
		int max = 0;
		int index = -2;
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				index = i;
			} else if(max != 0 && alphabet[i] == max) {
				index = -2;
			}
		}
		System.out.println((char)(index + 65));
	}

}
