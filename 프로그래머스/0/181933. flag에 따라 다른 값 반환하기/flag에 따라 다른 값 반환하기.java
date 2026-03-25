class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        /*
            - 정수 a, b 
            - boolean 변수 flag
            - flag 
                ----> true ----> a + b
                ----> false ----> a - b
        */
        answer = (flag) ? a + b : a - b;
        return answer;
    }
}