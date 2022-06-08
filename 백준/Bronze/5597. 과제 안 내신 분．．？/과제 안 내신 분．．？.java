import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[31];
        
        
        for(int i=0;i<28;i++){
            int a = sc.nextInt();
            arr[a] = true;
        }
        
        for(int i=1;i<31;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}