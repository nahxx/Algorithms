package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int plus = 1;
		int num = 0;
		String fraction = "";
		while(num < n) {
			num += plus;
			plus++;
		}
		int j = 0;
		for(int i = (num - (plus - 2)); i <= num; i++) {
			j++;
			if(i == n) {
				int n1 = 0;
				int n2 = 0;
				if(plus % 2 == 0) {
					n1 = plus - j;
					n2 = j;
				} else {
					n1 = j;
					n2 = plus - j;
				}
				fraction = n1 + "/" + n2;
				break;
			}
		}
		System.out.println(fraction);
	}

}
