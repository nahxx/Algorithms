package level0;

public class test17 {
	// ÇÇÀÚ ³ª´² ¸Ô±â(3)
    public int solution(int slice, int n) {
        int max = 1;
        while(true) {
            if(slice * max >= n) {
                break;
            }
            max++;
        }
        return max;
    }
}
