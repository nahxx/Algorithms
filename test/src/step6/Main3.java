package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main3 {
	// a~z : 97~122
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for(int i = 0; i < str.length(); i++) {
			int n = str.charAt(i);
			if(alphabet[n - 97] == -1) {
				alphabet[n - 97] = i;
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			bw.write(alphabet[i] + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
