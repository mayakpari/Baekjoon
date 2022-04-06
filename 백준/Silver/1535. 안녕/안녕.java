//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main_1535 {
//	static List<person> people;
//	static boolean[] visited;
//	static int n,max,glad;
//	static int[] glads,damages;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		glads = new int[n];
//		damages = new int[n];
//		people = new ArrayList<>();
//		visited = new boolean[n];
//		for(int i=0;i<n;i++) {
//			damages[i] = sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			glads[i] = sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			people.add(new person(glads[i],damages[i]));
//		}
//		for(int i=1;i<=n;i++) {
//			glad = 0;
//			solve(i,0,visited,100);
//		}
//		System.out.println(max);
//	}
//	
//	static void solve(int idx, int cnt,boolean[] visited, int health) {
//		if(cnt == idx) {
//			System.out.println(idx+": "+idx +" "+Arrays.toString(visited));
//			for(int i=0;i<n;i++) {
//				if(visited[i]) {
//					glad += glads[i];
//					health -= damages[i];
//				}
//			}
//			if(health > 0) {
//				max = Math.max(max, glad);
//			}
//			return;
//		}
//		
//		visited[cnt] = false;
//		solve(idx,cnt+1,visited,health);
//		visited[cnt] = true;
//		solve(idx,cnt+1,visited,health);
//	}
//}
//
//class person implements Comparable<person>{
//	int glad;
//	int damage;
//	person(int glad, int damage){
//		this.glad = glad;
//		this.damage = damage;
//	}
//	@Override
//	public int compareTo(person p) {
//		return p.damage - this.damage;
//	}
//}
import java.util.Scanner;

public class Main{

	static int n;
	static int[] health, glad,dp;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		health = new int[n];
		glad = new int[n];
		dp = new int[101];
		for (int i = 0; i < n; i++) {
			health[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			glad[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) { 
			for (int j = 100; j-health[i] > 0; j--) { 
				dp[j] = Math.max(dp[j], glad[i] + dp[j-health[i]]); 
			}
		}
		System.out.println(dp[100]);
	}
}
