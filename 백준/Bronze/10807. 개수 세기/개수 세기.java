import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<num;i++){
            if(arr[i]==search){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}