package level1;

import java.time.LocalDate;

public class test2 {
	// 2016³â
	public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        String string = date.getDayOfWeek().toString();
        return string.substring(0, 3);
	}
}
