class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for(int i=1;i<=count;i++){
            total += (long)(i*price);
        }
        if(total <= money){
            return 0;
        }else{
            return total - money;
        }
    }
}