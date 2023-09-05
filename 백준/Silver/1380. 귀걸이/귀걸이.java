import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sce = 0;    // 몇 번째 시나리오인지 표시
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {    // 0 입력시 종료
                return;
            }else {
                sce++;
            }
            
            ArrayList<String> girls = new ArrayList<String>();    // 입력받은 여학생들을 순서대로 저장해둘 배열
            
            for(int i = 0; i < n; i++) {                        // 여학생들 이름 n 명 입력 
                girls.add(br.readLine());
            }
            
            ArrayList<Integer> isNum = new ArrayList<Integer>();    // 입력받은 숫자를 저장하는 리스트
            for(int i = 0; i < n*2-1; i++ ) {                        // 여학생들의 귀걸이의 이동을 나타내는 입력 n*2 -1회 
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());            // 입력 중 A,B는 무시 학생의 번호를 나타내는 맨 앞 숫자만 입력 
                
                if (isNum.contains(num)) {                // 같은 수가 두 번 입력되면 귀걸이는 되돌려받은 것이므로 해당 숫자가 리스트에 있는지 확인
                    isNum.remove((Integer)num);            // 리스트에 있다면 귀걸이를 되돌려받았으므로 리스트에서 해당 값 제거 
                }else {
                    isNum.add(num);                        // 리스트에 없다면 처음 입력된 것으로 해당 숫자를 리스트에 추가해줌 
                }
            }
            
            int resultgirl = isNum.get(0);                                // 귀걸이를 되돌려받지 못한 학생은 isNum 리스트에 남아있는 번호의 학생임 
            System.out.println(sce + " " + girls.get(resultgirl-1));    // 시나리오 번호와 귀걸이를 돌려받지 못한 학생 출력  
        }
 
    }
 
}