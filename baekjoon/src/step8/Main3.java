package step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for(int i = 2; i < n; i++) {
			while(true) {
				if(n % i == 0) {
					bw.write(i + "\n");
					n /= i;
				} else {
					break;
				}
			}
			
		}
		if(n > 1) {
			bw.write(n + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
		/*
		while(!checkPrime(n)) {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					bw.write(i + "\n");
					n /= i;
					break;
				}
			}
		}
		bw.write(n + "\n");
		bw.flush();
		bw.close();
		br.close();
		*/
	}

}
