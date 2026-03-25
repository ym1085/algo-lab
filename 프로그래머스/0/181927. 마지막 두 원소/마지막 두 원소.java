import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        // num_list : [2, 1, 6]
        // 마지막 원소가 그 전 원소보다 크면 -> 마지막 원소 - 그 전 원소
        // 마지막 원소가 그 전 원소보다 안크면 -> 마지막 원소 * 2
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];
        
        int num = 0;
        if (last > before) {
            num = last - before;
        } else {
            num = last * 2;
        }
        
        answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[num_list.length] = num;
        return answer;
    }
}