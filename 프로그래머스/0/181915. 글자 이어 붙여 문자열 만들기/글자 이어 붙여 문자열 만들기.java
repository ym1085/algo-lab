class Solution {
    public String solution(String my_string, int[] index_list) {
        // my_string : cvsgiorszzzmrpaqpe
        // index_list : [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]
        // index_list Loop 돌리고 문자열에서 charAt로 뽑는다
        String result = "";
        for (int i = 0; i < index_list.length; i++) {
            char token = my_string.charAt(index_list[i]);
            result += token;
        }
        return result;
    }
}