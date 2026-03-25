import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        // i -> 0, 1, 2
        // n -> 1
        
        // n -> 3
        // 1,2,3
        for (int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }
        System.out.println(result);
        return result;
    }
}