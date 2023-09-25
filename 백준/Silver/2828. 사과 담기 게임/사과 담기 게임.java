import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int screen[]=new int[n];
       int basket[]=new int[m];
       int left=0,right=left+m-1;

       int j = sc.nextInt();
       int distance=0; 
       for(int i=0; i<j; i++){
           int apple=sc.nextInt()-1;
           if(apple<left){
               int diff=left-apple; 
               distance+=diff;
               left-=diff;
               right-=diff;
           }
           else if(apple>right){
               int diff=apple-right;
               distance+=diff;
               right+=diff;
               left+=diff;
           }
       }
       System.out.println(distance);
    }
}