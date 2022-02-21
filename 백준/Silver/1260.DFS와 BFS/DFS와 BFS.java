import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int[][] arr;
	public static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int point = sc.nextInt();
		int line = sc.nextInt();
		int start = sc.nextInt();
		
		arr = new int[point+1][point+1];
		
		for(int i=1;i<=line;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		visited = new boolean[point+1];
		dfs(start); 
		
		System.out.println();
        
		visited = new boolean[point+1];
		bfs(start); 

		
	}
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start+ " ");
		
		if(start == arr.length) {
			return;
		}

		for(int a=1;a<arr.length;a++) {
			if(arr[start][a] == 1 && visited[a] == false) {
				dfs(a);
			}
		}
			
	}
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>(); 
		
		que.add(start);
		visited[start] = true;
 		System.out.print(start+ " ");
		
		while(!que.isEmpty()) {
			
			int temp = que.peek();
			que.poll();
			for(int i=1; i<arr.length;i++) {
				if(arr[temp][i] ==1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
	}
	
	
	
}