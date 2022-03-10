import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String word = sc.next().toUpperCase();
        int max = 0;
        char ch = '?';
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i)-65]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);
            }else if(max == arr[i])
                ch = '?';
        }
        System.out.println(ch);
    }
}