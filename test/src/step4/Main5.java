package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[30];
		
		for(int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine()) - 1] = 1;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				bw.write((i + 1) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
