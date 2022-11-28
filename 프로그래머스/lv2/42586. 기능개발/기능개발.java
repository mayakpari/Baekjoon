import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int tmp = 0;
        int start = 0;
        int task = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            que.add(progresses[i]);
        }
        
        while(!que.isEmpty()){
            for(int i=start;i<speeds.length;i++){
                tmp = que.poll();
                tmp += speeds[i];
                que.add(tmp);
            }
            task = 0;
            while(!que.isEmpty()){
                if(que.peek() >= 100){
                    que.poll();
                    task++;
                    start++;
                }else{
                    if(task != 0){
                        list.add(task);
                    }
                    break;
                }
            }
            if(que.isEmpty()){
                list.add(task);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}