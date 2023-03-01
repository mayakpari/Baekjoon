import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
        public static int nowx, nowy, prevx, prevy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> visit = new ArrayList<String>(); // 방문한 좌표를 저장하기 위한 리스트
        String st = br.readLine();
        
        int startx = st.charAt(0);    // 첫번째 위치를 저장해둠 
        int starty = st.charAt(1);
        prevx = startx;
        prevy = starty;
 
        visit.add(st);
        
        
        for(int i = 0; i < 35; i++) {
            String s = br.readLine();
            nowx = s.charAt(0);
            nowy = s.charAt(1);
            
            if(visit.contains(s)) {    // 방문한 적 있는 곳에 또 다시 방문하면 Invalid
                System.out.println("Invalid");
                return;
            }
            
            if(Math.abs(nowx - prevx) == 2 && Math.abs(nowy - prevy) == 1 || Math.abs(nowx - prevx) == 1 && Math.abs(nowy - prevy) == 2) {    // 나이트가 이전 위치에서 이동할 수 있는 위치가 아니면 Invalid
                
            }else {
                System.out.println("Invalid");
                return;
            }
            
            visit.add(s);
            prevx = nowx;
            prevy = nowy;
        }
        
        if(Math.abs(nowx - startx) == 2 && Math.abs(nowy - starty) == 1 || Math.abs(nowx - startx) == 1 && Math.abs(nowy - starty) == 2) {    // 마지막 도달위치에서 첫 번째 위치로 갈 수 없으면 Invalid
            
        }else {
            System.out.println("Invalid");
            return;
        }
        
        
        System.out.println("Valid");
    }
 
}