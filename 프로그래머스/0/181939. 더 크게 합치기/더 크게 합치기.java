import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // input: a, b
        // a + b or b + a 큰값 return
        // a + b 와 b + a 같으면 a + b return
        int before = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int after = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));
        
        if (before > after) {
            answer = before;
        } else if (after > before) {
            answer = after;
        } else {
            answer = before;
        }
        return answer;
    }
}