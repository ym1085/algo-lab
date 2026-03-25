class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        /*
            num_list : [3, 4, 5, 2, 1]
            
            A : 모두 곱한값
            B : 모두 더하고 ^ 2 -> Math.pow(값, 제곱수)
        */
        
        int a = 1;
        int b = 0;
        for (int num : num_list) {
            System.out.println("num => " + num);
            a *= num;
            b += num;
        }
        System.out.println("a => " + a);
        System.out.println("b => " + b);
        System.out.println("Math.pow => " + Math.pow(b, 2));
        
        if (a < Math.pow(b, 2)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}