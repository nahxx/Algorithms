package level0;

public class test19 {
	// �ʰ��� ���� �ޱ�
	public int solution(int price){
        if(price >= 500000) {
			price -= (double)price / 100 * 20;
		} else if(price >= 300000) {
			price -= (double)price / 100 * 10;
		} else if(price >= 100000) {
			price -= (double)price / 100 * 5;
		}
        return price;
    }
}
