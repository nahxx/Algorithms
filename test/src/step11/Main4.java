package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4 {
	static int cnt = 0;
	static int n = 0;
	static int result = -1;

	public static void main(String[] args) throws IOException {
		// 병합 정렬
		// https://iseunghan.tistory.com/206
		// https://banjjak1.tistory.com/49
		// 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[length];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sort(arr, 0, length - 1);
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void sort(int[] arr, int left, int right) {
		mergeSort(arr, left, right);
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2; // 데이터 리스트의 중앙 인덱스를 구함
			mergeSort(arr, left, mid); // 중앙을 기준으로 왼쪽 데이터들을 분할
			mergeSort(arr, mid + 1, right); // 중앙을 기준으로 오른쪽 데이터들을 분할
			merge(arr, left, mid, right); // 정복 및 결합 과정을 진행
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int leftIndex = left; // 분할된 왼쪽 리스트들의 시작점 변수
		int rightIndex = mid + 1; // 분할된 오른쪽 리스트들의 시작점 변수
		int sortedIndex = left; // 정렬된 데이터가 저장될 인덱스
		int[] tmpArray = new int[right + 1]; // 정렬된 데이터를 임시로 저장할 곳
		
		/*
		 분할된 왼쪽 리스트의 인덱스가 mid까지 온 경우 왼쪽 정렬 완료
		 분할된 오른쪽 리스트의 인덱스가 right까지 온 경우 오른쪽 정렬 완료
		 즉, 왼쪽 또는 오른쪽 둘 중 하나라도 정렬이 완료된 경우 반복문을 빠져나감
		 */
		while(leftIndex <= mid && rightIndex <= right) {
			cnt++;
			if(cnt > n) {
				result = tmpArray[sortedIndex - 1];
			}
			// System.out.print(cnt);
			// 오름차순 조건문
			if(arr[leftIndex] <= arr[rightIndex]) {
				// System.out.println(" : " + arr[leftIndex]);
				tmpArray[sortedIndex++] = arr[leftIndex++];
			} else {
				// System.out.println(" : " + arr[rightIndex]);
				tmpArray[sortedIndex++] = arr[rightIndex++];
			}
		}
		
		// 남은 부분 옮기기
		if(leftIndex > mid) {
			// 왼쪽이 다 정렬된 경우 오른쪽 데이터들의 남은 부분들을 다 옮겨야 함
			for(int i = rightIndex; i <= right; i++) {
				cnt++;
				if(cnt > n) {
					result = tmpArray[sortedIndex - 1];
				}
				/*
				System.out.print(cnt);
				System.out.println(" : " + arr[i]);
				*/
				tmpArray[sortedIndex++] = arr[i];
			}
		} else {
			// 오른쪽이 다 정렬된 경우 왼쪽 데이터들의 남은 부분들을 다 옮겨야 함
			for(int i = leftIndex; i <= mid; i++) {
				cnt++;
				if(cnt > n) {
					result = tmpArray[sortedIndex - 1];
				}
				/*
				System.out.print(cnt);
				System.out.println(" : " + arr[i]);
				*/
				tmpArray[sortedIndex++] = arr[i];
			}
		}
		
		// 원래 배열에 정렬된 데이터로 덮어씌움
		for(int i = left; i <= right; i++) {
			arr[i] = tmpArray[i];
		}
	}
}
