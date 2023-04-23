import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class king{
        char x;
        char y;
        king(char x, char y){
            this.x = x;
            this.y = y;
        }
    }

    static class stone{
        char x;
        char y;
        stone(char x, char y){
            this.x = x;
            this.y = y;
        }
    }

    static king k;
    static stone s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] input = br.readLine().split(" ");

        k = new king(input[0].charAt(0),input[0].charAt(1));
        s = new stone(input[1].charAt(0),input[1].charAt(1));
        int num = Integer.parseInt(input[2]);

        for(int i=0;i<num;i++){
            String str = br.readLine();
            switch(str){
                case "R" :
                    move(1,0);
                    break;
                case "L" :
                    move(-1,0);
                    break;
                case "B" :
                    move(0,-1);
                    break;
                case "T" :
                    move(0,1);
                    break;
                case "RT" :
                    move(1,1);
                    break;
                case "LT" :
                    move(-1,1);
                    break;
                case "RB" :
                    move(1,-1);
                    break;
                case "LB" :
                    move(-1,-1);
                    break;
            }
        }
        System.out.println(k.x+""+k.y);
        System.out.println(s.x+""+s.y);
    }

    public static void move(int x, int y){
        if(k.x + x >= 'A' && k.x + x <= 'H' && k.y + y >= '1' && k.y + y <= '8'){
            k.x += x;
            k.y += y;
            if(k.x == s.x && k.y == s.y){
                if(s.x + x >= 'A' && s.x + x <= 'H' && s.y + y >= '1' && s.y + y <= '8'){
                    s.x += x;
                    s.y += y;
                }else{
                    k.x -= x;
                    k.y -= y;
                }
            }
        }

    }
}
