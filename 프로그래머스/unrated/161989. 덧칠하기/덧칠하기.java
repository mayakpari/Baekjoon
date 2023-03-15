class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        boolean[] board = new boolean[n+1];
        
        for(int i=0;i<section.length;i++){
            board[section[i]] = true; // 칠해줘야 하는 부분을 true처리
        }
        
        
        for(int i=0;i<section.length;i++){
            if(board[section[i]]){ // 칠해줘야 한다면
                for(int j=section[i];j<section[i]+m;j++){ // 해당위치를 기준으로 롤러크기만큼 false 처리
                    if(j<n+1){
                        board[j] = false;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}