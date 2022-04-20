import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int l,c;
	static char arr[],newarr[];
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		l = sc.nextInt();
		c = sc.nextInt();
		newarr = new char[c];
		visited = new boolean[c];
		for(int i=0;i<c;i++) {
			newarr[i] = sc.next().charAt(0);
		}
		Arrays.sort(newarr);
	
		combination(0, 0);
	}
	static void combination(int start,int cnt) {
		if(cnt==l) {
			int v = 0;
			int cc = 0;
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<c;i++) {
				if(visited[i]) {
					sb.append(newarr[i]);
					
					if(newarr[i]=='a'||newarr[i]=='e'||newarr[i]=='i'||newarr[i]=='o'||newarr[i]=='u') {
						v++;
					}else {
						cc++;
					}			
				}
			}
			if(v>=1 && cc>=2) System.out.println(sb);
		
		}
		//백트래킹
		for(int i=start;i<c;i++) {
			visited[i]=true;
			combination(i+1,cnt+1);
			visited[i]=false;
		}
	}
}