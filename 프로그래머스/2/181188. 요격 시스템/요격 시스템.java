import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets,(o1,o2) -> { // 개구간 시작 지점 기준으로 정렬
            if(o1[1] == o2[1]){
                return  o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        int t = 0; // 요격기 시작 위치
        
        for(int i=0;i<targets.length;i++){ // 요격시작
            if(t <= targets[i][0]){
                t = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}