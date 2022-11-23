class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        if(n==1){
            return 0;
        }
        
        while(answer < 500 && n != 1){
            answer++;
            if(n%2==0){
                n/=2;
            }else{
                n = n*3 + 1;
            }
        }
        
        if(n == 1){
            return answer;
        }else{
            return -1;
        }
    }
}