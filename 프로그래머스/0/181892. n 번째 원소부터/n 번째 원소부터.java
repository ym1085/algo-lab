import java.util.*;
    
class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        
        // n(3)번째 원소부터 마지막 원소까지의 모든 원소를 담은 배열을 반환
        for (int i = 0; i < num_list.length; i++) {
            // 1, 2, 3
            if ((i + 1) >= n) {
                result.add(num_list[i]);
            }
        }
        return result;
    }
}