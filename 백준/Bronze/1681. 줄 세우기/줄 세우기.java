import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        char LC = (char) (L + '0');

        // 검사 시작
        int i = 1; 
        int n = 0; 
        int P = 0; 

        while(n != N)
        {
            String A = String.valueOf(i);
            char[] AC = A.toCharArray();

            for(int j = 0; j < A.length(); j++){
                if(AC[j] == LC){
                    P = 1;
                    break;
                }
            }

            if(P == 0){ 
                n++;
                i++;
            }else{
                P = 0;
                i++;
            }
        }

        System.out.println(i-1);
       
        sc.close();
    }    
}