package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 안정 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				System.out.println(o1[0] + " - " + o2[0] + " = " + (Integer.parseInt(o1[0]) - Integer.parseInt(o2[0])));
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				/*
				if(Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])) {
					return -1;
				} else if(Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])) {
					return 1;
				}
				return 0;
				*/
			}
		});
		
		/*
		// 삽입정렬(시간초과)
		for(int i = 1; i < arr.length; i++) {
			String[] tmp = new String[2];
			for(int j = 0; j < i; j++) {
				if(arr[i][0].compareTo(arr[j][0]) < 0) {
					insert(arr, i, j);
				}
			}
		}
		*/
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	/*
	// 삽입정렬(시간초과)
	public static String[][] insert(String[][] arr, int target_idx, int insert_idx) {
		String[] insert_value = arr[target_idx];
		
		for(int i = target_idx; i > insert_idx; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[insert_idx] = insert_value;
		
		return arr;
	}
	*/
}
