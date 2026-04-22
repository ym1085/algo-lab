import java.util.*;

class Solution {
    // 1번 방법
//     public int solution(String binomial) {
//         int answer = 0;
//         String[] a = binomial.split(" ");
        
//         String op = a[1];
//         if (op.equals("+")) {
//             System.out.println(Integer.parseInt(a[0]));
//             answer = Integer.parseInt(a[0]) + Integer.parseInt(a[2]);
//         } else if (op.equals("-")) {
//             answer = Integer.parseInt(a[0]) - Integer.parseInt(a[2]);
//         } else if (op.equals("*")) {
//             answer = Integer.parseInt(a[0]) * Integer.parseInt(a[2]);
//         }
//         return answer;
//     }
    
    // 2번 방법
    public int solution(String binomial) {
        String[] bn = binomial.split(" ");
        return (bn[1].equals("+")) ? Integer.parseInt(bn[0]) + Integer.parseInt(bn[2]) :
        (bn[1].equals("-")) ? Integer.parseInt(bn[0]) - Integer.parseInt(bn[2]) :
        (bn[1].equals("*")) ? Integer.parseInt(bn[0]) * Integer.parseInt(bn[2]) : 0;
    }
}