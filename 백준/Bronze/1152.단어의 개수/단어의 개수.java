import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.trim();
        if(line.length() == 0)
        	System.out.println(0);
        else
        	System.out.println(line.split(" ").length);
    }
}