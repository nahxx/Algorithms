package level0;

public class test15 {
	// ÇÇÀÚ ³ª´² ¸Ô±â(1)
	public int solution(int n) {
        int answer = n / 7;
        answer += n % 7 != 0 ? 1 : 0;
        return answer;
    }
    
    public int solution2(int n) {
        int answer = n % 7 == 0 ? (n / 7) : (n / 7 + 1);
        return answer;
    }

}
