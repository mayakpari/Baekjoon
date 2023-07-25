import java.util.*;
import java.io.*;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int NUMBER_OF_BOOK = Integer.parseInt(st.nextToken());
        final int MAX_WEIGHT = Integer.parseInt(st.nextToken());
        int box = 0;
        int answer = 1;
        if(NUMBER_OF_BOOK != 0) {
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<NUMBER_OF_BOOK;i++) {
                int book = Integer.parseInt(st.nextToken());
                if(box + book <= MAX_WEIGHT) {
                    box += book;
                }else {
                    answer++;
                    box = book;
                }
            }
        }else {
            answer = 0;
        }
       
        
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}