import java.util.*;

class Solution {
    public List<Integer> solution(int start_num, int end_num) {
        // start_num : 3
        // end_num : 10
        
        // for 3 ~ 10
        List<Integer> result = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            result.add(i);
        }
        return result;
    }
}