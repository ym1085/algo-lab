import java.util.*;

class Solution {
    public int solution(int a, int b) {
        return (a % 2 != 0 && b % 2 != 0) ? (int) Math.pow(a, 2) + (int) Math.pow(b, 2) :
                (a % 2 != 0 || b % 2 != 0) ? 2 * (a + b) : 
                (a % 2 == 0 && b % 2 == 0) ? Math.abs(a - b) : 0;
    }
}