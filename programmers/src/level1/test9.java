package level1;

import java.util.Arrays;

public class test9 {
	// ���ڿ� ������������ ��ġ�ϱ�
	public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }

}
