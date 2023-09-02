import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    static int moveX[] = {0,1,0,-1};
    static int moveY[] = {-1,0,1,0};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int row=1, col=1;
        char arr[][] = new char[101][101];
        for(int i=0; i<101; i++) {
            for(int j=0; j<101; j++)
                arr[i][j] = '#';
        }
        int startX, startY, minY, minX, maxY, maxX;
        startX = startY = minY = minX = maxX = maxY = 50;
        int dir = 2;
        arr[startY][startX] = '.';
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'F') {
                startX += moveX[dir];
                startY += moveY[dir];
                arr[startY][startX] = '.';
                maxX = Math.max(maxX, startX);
                maxY = Math.max(maxY, startY);
                minX = Math.min(minX, startX);
                minY = Math.min(minY, startY);
            }
            else if(str.charAt(i) == 'L'){
                if(dir == 0)
                    dir = 3;
                else
                    dir--;
            }else {
                if(dir==3)
                    dir=0;
                else
                    dir++;
            }
        }
        
        for(int i=minY; i<=maxY; i++) {
            for(int j=minX; j<=maxX; j++) {
                System.out.print(arr[i][j]);
            }System.out.println();
        }
    }
}