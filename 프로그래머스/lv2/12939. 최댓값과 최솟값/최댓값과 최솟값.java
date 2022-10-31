class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        String[] list = s.split(" ");
        for(String str : list){
            int num = Integer.parseInt(str);
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        answer += min;
        answer += " ";
        answer += max;
        return answer;
    }
}