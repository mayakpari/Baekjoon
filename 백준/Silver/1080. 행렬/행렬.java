import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		char[][] arr = new char[n][m];
		char[][] arr2 = new char[n][m];

		for(int i=0;i<n;i++){
			String str = sc.next();
			for(int j=0;j<m;j++){
				arr[i][j] = str.charAt(j);
			}
		}

		for(int i=0;i<n;i++){
			String str = sc.next();
			for(int j=0;j<m;j++){
				arr2[i][j] = str.charAt(j);
			}
		}

		for(int i=0;i<n-2;i++){
			for(int j=0;j<m-2;j++){
				if(arr[i][j] != arr2[i][j]){
					cnt++;
					for(int x=i;x<i+3;x++){
						for(int y=j;y<j+3;y++){
							if(arr2[x][y] == '1'){
								arr2[x][y] = '0';
							}else
								arr2[x][y] = '1';
						}
					}
				}
			}
		}



		if(!Arrays.deepEquals(arr,arr2)){
			cnt = -1;
		}

		System.out.println(cnt);
	}
}