import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // <숫자 값, 해당 숫자의 인덱스>를 저장할 해시맵
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 내가 찾는 '짝꿍' 숫자
            
            // 1. 메모장(map)에 내 짝꿍이 이미 있는지 확인
            if (map.containsKey(complement)) {
                // 있다면 [짝꿍의 위치, 내 위치] 반환
                return new int[] { map.get(complement), i };
            }
            
            // 2. 짝꿍이 없다면 나중에 올 다른 숫자를 위해 내 정보를 메모장에 저장
            map.put(nums[i], i);
        }
        
        // 문제 조건상 반드시 답이 존재하므로 이 코드는 실행되지 않음
        return new int[] {};
    }
}