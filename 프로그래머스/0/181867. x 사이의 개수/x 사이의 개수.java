import java.util.*;

class Solution {
    public List solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        String[] str = myString.split("x", -1);
        System.out.println(Arrays.toString(str));
        // ["o", "oo", "o", "", "o", ""]
        for (int i = 0; i < str.length; i++) {
            answer.add(str[i].length());
        }
        return answer;
    }
}