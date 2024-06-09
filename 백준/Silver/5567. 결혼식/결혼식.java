import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i<=N; i++)
            l.add(new ArrayList<>());

        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            l.get(A).add(B);
            l.get(B).add(A);
        }

        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        boolean[] visited = new boolean[N+1];
        visited[1] = true;

        //친구들을 확인
        for(int i = 0; i<l.get(1).size(); i++){
            int friend = l.get(1).get(i);

            if(visited[friend])
                continue;

            visited[friend] = true;
            sum++;
            q.offer(friend);
        }

        while(!q.isEmpty()){
            int friend = q.poll();

            for(int i = 0; i<l.get(friend).size(); i++){
                int friendFriend = l.get(friend).get(i);

                if(visited[friendFriend])
                    continue;

                sum++;
                visited[friendFriend] = true;
            }
        }

        System.out.println(sum);
    }
}