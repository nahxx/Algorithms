package level0;

public class test20 {
	// ���̽� �Ƹ޸�ī��
	public int[] solution(int money) {
		// �ܼ�, ������
        int[] answer = new int[2];
        int max = 0;
        while(true) {
        	max++;
        	if(5500 * max > money) {
        		answer[0] = --max;
        		answer[1] = money - 5500 * max;
        		break;
        	}
        }
        return answer;
    }

}
