package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 길이가 짧은 것부터
		// 길이가 같으면 사전 순으로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		// 중복 제거
		HashSet<String> set = new HashSet<>(Arrays.asList(arr));
		arr = set.toArray(new String[0]);
		
		// sort(arr);
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
			
		});
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/*
	public static String[] sort(String[] arr) {
		String tmp = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].length() > arr[j].length()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} else if(arr[i].length() == arr[j].length()) {
					if(arr[i].compareTo(arr[j]) > 0) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
		
		return arr;
	}
	*/
}
