package level0;

public class test7 {
	// µÎ ¼öÀÇ ³ª´°¼À
	public int solution(int num1, int num2) {
        double d = (double)num1 / num2 * 1000;
        return (int)d;
    }
	
	// 231007 Math È°¿ë
	public int solution2(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000;
        return (int)Math.floor(answer);
	}
}
