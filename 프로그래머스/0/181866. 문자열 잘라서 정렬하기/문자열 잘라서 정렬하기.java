import java.util.*;

class Solution {
    // 오답 걸린 부분 -> xx가 연속적으로 있으면 빈 값이 배열에 들어갈 수 있음
    // public String[] solution(String myString) {
    //     String[] str = myString.split("x");
    //     Arrays.sort(str);
    //     return str;
    // }
    
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(num -> !num.equals(""))
                .sorted()
                .toArray(size -> new String[size]);
    }
}