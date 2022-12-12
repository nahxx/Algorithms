package step6;

import java.io.*;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		for(int i = 0; i < cnt; i++) {
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println(sum);
	}

}
