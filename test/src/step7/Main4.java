package step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws IOException {
		// A : 낮에 오르는 높이, B: 밤에 떨어지는 높이, V: 정상 => 며칠 걸리는지?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int c = v / (a - b);

		while(true) {
			if((a - b) * c + b >= v) {
				c--;
			} else {
				c++;
				break;
			}
		}

		System.out.println(c);
	}

}
