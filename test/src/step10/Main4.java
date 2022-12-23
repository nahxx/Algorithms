package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://st-lab.tistory.com/225 참고하여 힙정렬로 문제 풀이
 *
 */
public class Main4 {
	
	// 부모 인덱스르 얻는 함수
	private static int getParent(int child) {
		return (child - 1) / 2;
	}
	
	// 두 인덱스의 원소를 교환하는 함수
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	// 힙을 만드는 함수1(재귀함수) => 정렬 제대로 안돼서 두번째 함수로 사용
	private static void heapify(int[] arr, int parentIdx, int lastIdx) {
		/*
		 * 현재 트리에서 부모 노드의 자식노드 인덱스를 각각 구해준다.
		 * 현재 부모 인덱스가 가장 큰 값을 갖고있다고 가정한다.
		 */
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		int largestIdx = parentIdx;
		
		/*
		 * left child node와 비교
		 * 자식노드 인덱스가 끝의 원소 인덱스를 넘어가지 않으면서
		 * 현재 가장 큰 인덱스보다 왼쪽 자식노드의 값이 더 클 경우
		 * 가장 큰 인덱스를 가리키는 largestIdx를 왼쪽 자식노드 인덱스로 변경
		 */
		if(leftChildIdx < lastIdx && arr[largestIdx] < arr[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		
		/*
		 * right child node와 비교
		 * 자식노드 인덱스가 끝의 원소 인덱스를 넘어가지 않으면서
		 * 현재 가장 큰 인덱스보다 오른쪽 자식노드의 값이 더 클 경우
		 * 가장 큰 인덱스를 가리키는 largestIdx를 오른쪽 자식노드 인덱스로 변경
		 */
		if(rightChildIdx < lastIdx && arr[largestIdx] < arr[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		/*
		 * largestIdx와 부모노드가 같지 않다는 것은
		 * 위 자식노드 비교과정에서 현재 부모노드보다 큰 노드가 존재한다는 뜻
		 * 그럴 경우 해당 자식 노드와 부모 노드 교환,
		 * 교환된 자식노드를 부모노드로 삼은 서브트리를 검사하도록 재귀 호출
		 */
		if(parentIdx != largestIdx) {
			swap(arr, largestIdx, parentIdx);
			heapify(arr, largestIdx, lastIdx);
		}
	}
	
	// 힙을 만드는 함수2(wihle)
	private static void heapify2(int[] arr, int parentIdx, int lastIdx) {
		int leftChildeIdx;
		int rightChildeIdx;
		int largestIdx;
		
		/*
		 * 현재 부모 인덱스의 자식 노드 인덱스가
		 * 마지막 인덱스를 넘지 않을 때까지 반복
		 * 이때, 왼쪽 자식 노드 기준으로 해야 함
		 * 오른쪽 자식 노드 기준으로 범위검사시
		 * 마지막 부모 인덱스가 왼쪽 자식만 갖고 있을 경우
		 * 왼쪽 자식노드와 비교 및 교환이 불가능하기 때문
		 */
		while((parentIdx * 2) + 1 <= lastIdx) {
			leftChildeIdx = (parentIdx * 2) + 1;
			rightChildeIdx = (parentIdx * 2) + 2;
			largestIdx = parentIdx;
			
			/*
			 * left child node와 비교
			 * (범위는 while문에서 검사했으므로 별도 검사 x)
			 */
			if(arr[leftChildeIdx] > arr[largestIdx]) {
				largestIdx = leftChildeIdx;
			}
			
			/*
			 * right child node와 비교
			 * right childe node는 범위 검사 필요함
			 */
			if(rightChildeIdx <= lastIdx && arr[rightChildeIdx] > arr[largestIdx]) {
				largestIdx = rightChildeIdx;
			}
			
			/*
			 * 교환 발생시 두 원소 교체 후
			 * 교환이 된 자식노드를 부모 노드가 되도록 교체
			 */
			if(largestIdx != parentIdx) {
				swap(arr, parentIdx, largestIdx);
				parentIdx = largestIdx;
			} else {
				return;
			}
		}
	}
	
	// 힙 정렬
	public static void heapsort(int[] arr) {
		int size = arr.length;
		
		/*
		 * 부모 노드와 heapify과정에서 음수가 발생하면 잘못된 참조가 발생하므로
		 * 원소가 1개 또는 0개일 경우 정렬할 필요없이 바로 함수 종료
		 */
		if(size < 2) {
			return;
		}
		
		// 가장 마지막 노드의 부모 노드 인덱스
		int parentIdx = getParent(size - 1);
		
		// max heap 만들기
		for(int i = parentIdx; i >= 0; i--) {
			// 부모 노드(i값)을 1씩 줄이면서 heap 조건을 만족시키도록 재구성
			heapify2(arr, i, size - 1);
		}
		
		// 정렬 과정
		for(int i = size - 1; i > 0; i--) {
			/*
			 * root인 0번째 인덱스와 i번째 인덱스의 값을 교환해준 뒤
			 * 0 ~ (i-1)까지의 부분트리에 대해 max heap을 만족하도록 재구성
			 */
			swap(arr, 0, i);
			heapify2(arr, 0, i - 1);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 병합정렬 or 힙정렬 사용하여 오름차순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		heapsort(arr);
		for(int n : arr) {
			bw.write(n + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
