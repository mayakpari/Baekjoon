class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0,1,-1,0}; // 4방향
        int[] dw = {1,0,0,-1}; // 4방향
        int h_check,w_check; // 4방향 위치값
        for(int i=0;i<4;i++){
            h_check = h+dh[i]; 
            w_check = w+dw[i];
            if(h_check>=0 && h_check < board.length && w_check>=0 && w_check < board[0].length){ // 격자 범위를 벗어나지 않고
                if(board[h][w].equals(board[h_check][w_check])){ // 중앙값과 일치하면 갯수 증가
                    answer++;
                }
            }
        }
        return answer;
    }
}