import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        while(true){
            ans++;
            int cnt = 0;
            for(int i=0;i<5;i++){
                if(ans % a[i] == 0){
                    cnt++;
                }
            }
            if(cnt>=3){
                break;
            }
        }
        System.out.println(ans);
    }
}