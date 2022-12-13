package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(i == str.length() - 1) {
				cnt++;
				break;
			}
			String s = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1));
			if(s.equals("dz") && i < str.length() - 2) {
				s += String.valueOf(str.charAt(i + 2));
			}
			for(int j = 0; j < croa.length; j++) {
				if(croa[j].equals(s)) {
					if(s.equals("dz=")) {
						i += 2;
					} else {
						i++;
					}
					break;
				}
			}
			cnt++;
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
