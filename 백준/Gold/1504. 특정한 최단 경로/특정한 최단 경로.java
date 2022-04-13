import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
	static int inf = 200000000;
	static int n,e;
	static int[] dist;
	static boolean[] check;
	static List<List<node>> list;
	static class node implements Comparable<node>{
		int idx;
		int cost;
		node(int idx, int cost){
			this.idx = idx;
			this.cost = cost;
		}
		@Override
		public int compareTo(node o) {
			return Integer.compare(this.cost, o.cost);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		for(int i=0;i<n+1;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<e;i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			list.get(from).add(new node(to,weight));
			list.get(to).add(new node(from,weight));
		}
		st = new StringTokenizer(br.readLine());
		int v1 = Integer.parseInt(st.nextToken());
		int v2 = Integer.parseInt(st.nextToken());
		
		int ans1 = 0;
		int ans2 = 0;
		
		ans1 += (dijkstra(1,v1)+dijkstra(v1,v2)+dijkstra(v2,n));
		ans2 += (dijkstra(1,v2)+dijkstra(v2,v1)+dijkstra(v1,n));
		
//		if(ans1 >= Integer.MAX_VALUE && ans2>= Integer.MAX_VALUE) {
//			System.out.println(-1);
//		}else
//			System.out.println(Math.min(ans1, ans2));
		if(ans1 >= inf && ans2 >= inf) {
			System.out.println(-1);
		}else
			System.out.println(Math.min(ans1, ans2));
	}
	
	
	static int dijkstra(int start,int end) {
		check = new boolean[n+1];
		dist = new int[n+1];
//		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(dist, inf);
		Arrays.fill(check, false);
		
		PriorityQueue<node> pq = new PriorityQueue<>();
		pq.add(new node(start,0));
		dist[start] = 0;
		
		while(!pq.isEmpty()) {
			node n = pq.poll();
			int curr = n.idx;
			int currDist = n.cost;
			
			if(dist[curr] < currDist)
				continue;
			
			for(int i=0;i<list.get(curr).size();i++) {
				int a = dist[curr] + list.get(curr).get(i).cost;
				if(a < dist[list.get(curr).get(i).idx]) {
					dist[list.get(curr).get(i).idx] = a;
					pq.offer(new node(list.get(curr).get(i).idx,a));
				}
			}
		}
		
		return dist[end];
	}
}
