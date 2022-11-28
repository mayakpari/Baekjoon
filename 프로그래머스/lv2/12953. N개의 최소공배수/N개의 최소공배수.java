class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int max = arr[arr.length-1];
        int time = 0;
        boolean check = false;
        outer : for(;;){
            time++;
            for(int i=0;i<arr.length-1;i++){
                if(max*time % arr[i] != 0){
                    continue outer;
                }
            }
            return max*time;
        }
    }
}