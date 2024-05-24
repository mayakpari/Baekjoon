import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] arr = input.toCharArray(); // 임의로 수가 제거된 수열
        int arrP = 0; // 수열 포인터

        int ans = 1; 

        while(arrP < arr.length){

            String num = Integer.toString(ans);
            
            // num이 2자리수 이상인 경우, 모든 자리를 검사하기 위해 반복문 돌림
            for(int i=0;i<num.length();i++){
                if(num.charAt(i) == arr[arrP]){ // 수가 포함된 경우
                    arrP++; // 포인터 이동
                }
                if(arrP >= arr.length) break;
            }
            ans = ans + 1;
        }
        System.out.println(ans-1);
    }
}