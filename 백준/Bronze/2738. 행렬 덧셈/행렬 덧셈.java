import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            if(i!=0){
                System.out.println();
            }
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + sc.nextInt() + " ");
            }
        }
    }
}