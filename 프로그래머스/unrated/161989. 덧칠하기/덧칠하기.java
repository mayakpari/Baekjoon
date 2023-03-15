class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        boolean[] wall = new boolean[n+1];
        
        for(int i=0;i<section.length;i++){
            wall[section[i]] = true; // 칠해줘야 하는 부분을 true처리
        }
        
        
        for(int i=0;i<section.length;i++){
            if(wall[section[i]]){ // 칠해줘야 한다면
                for(int j=section[i];j<section[i]+m;j++){ // 해당위치를 기준으로 롤러크기만큼 false 처리
                    if(j<n+1){ // 배열 범위 초과 검사
                        wall[j] = false;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}