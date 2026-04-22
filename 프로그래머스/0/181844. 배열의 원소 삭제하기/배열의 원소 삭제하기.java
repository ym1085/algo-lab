import java.util.*;

class Solution {
    
    // 1번 방법 : List의 remove 사용
    // public List solution(int[] arr, int[] delete_list) {
    //     List<Integer> answer = new ArrayList<>();
    //     for (int num : arr) {
    //         answer.add(num);
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < delete_list.length; j++){
    //             if (arr[i] == delete_list[j]) {
    //                 answer.remove(Integer.valueOf(arr[i]));
    //             }
    //         }
    //     }
    //     return answer;
    // }
    
    // 2번 방법 : Set 사용
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        for (int num : delete_list) {
            set.add(num);
        }
        return Arrays.stream(arr).filter(i -> !set.contains(i)).toArray();
    }
}