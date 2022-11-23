class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if(arr.length==1){
            return answer;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        answer = new int[arr.length-1];
        int ptr = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != min){
                answer[ptr++] = arr[i];
            }
        }
        return answer;
    }
}