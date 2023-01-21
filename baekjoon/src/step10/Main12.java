package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 좌표 압축
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[n];
		Integer[] result;
 		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 두번째 방법
		result = arr.clone();
		Arrays.sort(arr);
		
		int cnt = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], cnt++);
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			bw.write(map.get(result[i]) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
		
		/*
		// 첫번째 방법
		HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
		result = set.toArray(new Integer[0]);
		
		Arrays.sort(result);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < result.length; i++) {
			map.put(result[i], i);
		}
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(map.get(arr[i]) + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		*/
	}

}
