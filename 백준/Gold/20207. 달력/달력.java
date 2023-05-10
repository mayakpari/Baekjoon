import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main{
//    static class task implements Comparator<task> {
//        int start;
//        int end;
//        int day;
//        task(int start, int end, int day){
//            this.start = start;
//            this.end = end;
//            this.day = day;
//        }
//
//        @Override
//        public int compare(task t1, task t2){
//            if(t1.start < t2.start){
//                return 1;
//            }else if(t1.start > t2.start){
//                return -1;
//            }else{
//                if(t1.day < t2.day){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        }
//    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int start,end,day;
        int last = 0;
        int[] arr = new int[366];
//        PriorityQueue<task> pq = new PriorityQueue();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
//            day = end - start + 1;
            if(end > last){
                last = end;
            }
            for(int j=start;j<=end;j++){
                arr[j]++;
            }
//            pq.offer(new task(start,end,day));
        }
//        while(!pq.isEmpty()){
//            task t = pq.poll();
//            for(int i=t.start;i<t.end;i++){
//                arr[i]++;
//            }
//        }

//        for(int i=1;i<=last;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
        int cnt = 0;
        int max = 0;
        int answer = 0;
        for(int i=1;i<=last;i++){
            if(arr[i] > 0){
                cnt++;
                if(max < arr[i]) max = arr[i];
            }else{
                answer += cnt*max;
//                System.out.println(cnt +" " + max + " " + cnt*max);
                cnt = 0;
                max = 0;
            }
        }
        answer+= cnt*max;


        System.out.println(answer);
    }
}