import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x,y,w,s;
        
        String [] t = br.readLine().split(" ");
        
        x = Integer.parseInt(t[0]);
        y = Integer.parseInt(t[1]);
        w = Integer.parseInt(t[2]);
        s = Integer.parseInt(t[3]);
        long ans = 0;
        if(2*w < s) {
            ans = (x+y)*w;
        }
        else if(2*w > 2*s) {
            if((x+y)%2==0) {
                ans = Math.max(x, y)*s;
            }
            else {
                ans = (Math.max(x, y)-1)*s;
                ans+=w;
                
            }
        }
        else {
            if(x==y) {
                ans = s*x;
            }
            else {
                ans = Math.min(x*s, y*s);
                ans+=Math.abs(x-y)*w;
            }
        }
        System.out.println(ans);
    }
}