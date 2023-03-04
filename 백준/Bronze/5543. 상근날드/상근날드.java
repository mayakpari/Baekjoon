import java.util.*;

public class Main{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       int[] arr = new int[3];
       int[] arr2 = new int[2];
       int min=0;
       int min2=0;
       for(int i=0;i<3;i++) {
    	   arr[i]= sc.nextInt();
       }
       for(int j=0;j<2;j++) {
    	   arr2[j]=sc.nextInt();
       }
       
       Arrays.sort(arr);
       Arrays.sort(arr2);
       
       int answer = arr[0] + arr2[0] - 50;
       System.out.println(answer);
    }
}