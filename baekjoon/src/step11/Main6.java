package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
			첫번째 장대 -> 세번째 장대로 이동
			입력값 : 첫번째 장대에 있는 원반개수
			출력값 : 첫재쭐은 옮긴 횟수 / 두번째줄부터는 몇번째에서 몇번째로 옮겼는지 출력
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, n) - 1 + "\n");
		hanoi(n, 1, 2, 3);
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void move(int start, int to) throws IOException {
		bw.write(start + " " + to + "\n");
	}
	
	public static void move2(int n, int start, int to) throws IOException {
		bw.write(n + "번째 원반을 " + start + "에서 " + to + "로 이동\n");
	}
	
	public static void hanoi(int n, int start, int mid, int to) throws IOException {
		if(n == 1) {
//			move(start, to);
			move2(n, start, to);
			return;
		}
		
		hanoi(n-1, start, to, mid);
//		move(start, to);
		move2(n, start, to);
		hanoi(n-1, mid, start, to);
	}
}
