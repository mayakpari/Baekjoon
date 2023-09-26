import java.util.Scanner;

public class Main {
	static int n,l;
	static int s,e;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		l=sc.nextInt();
		int min=Integer.MAX_VALUE;
		int sum=0;
		int start=0;
		for (int i = 0; i <=n; i++) {
				sum+=i;
				while(sum>n) {
					sum-=start;
					start+=1;
				}
				if(sum==n && i-start+1>=l) {
					if(min>i-start+1) {
						s=start;
						e=i;
						min=i-start+1;
					}
					if(i-start+1==1)break;
				}
		}
		if(sum-s==n && (e-s+1)>l) {
			s+=1;
		}
		
		if(e-s+1>100 || min==Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			for (int i = s; i <=e; i++) {
				System.out.print(i+" ");
			}
		}

		
	}
	
}