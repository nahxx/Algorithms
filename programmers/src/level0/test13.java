package level0;

import java.util.Arrays;

public class test13 {
	public int solution(int[] array) {
        int[] arr = new int[1000];
        int max = 0;
        int cnt = 0;
        int result = -1;
        for(int num : array) {
            arr[num] += 1;
            if(arr[num] > max) {
                max = arr[num];
                result = num;
                cnt = 1;
            } else if(arr[num] == max) {
                cnt += 1;
            }
        }
        result = cnt > 1 ? -1 : result;
        return result;
    }
}
