package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i < length; i++) {
			String check = "";
			String str = br.readLine();
			boolean chk = true;
			for(int j = 0; j < str.length(); j++) {
				String s = String.valueOf(str.charAt(j));
				if(!(check.contains(s))) {
					check += s;
				} else if(check.charAt(check.length() - 1) == str.charAt(j)) {
					continue;
				} else {
					chk = false;
					break;
				}
			}
			if(!chk) continue;
			else cnt++;
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
		br.close();
	}

}
