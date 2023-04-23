import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sw_num = Integer.parseInt(st.nextToken());
        boolean[] swt = new boolean[sw_num+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=sw_num;i++){
            int n = Integer.parseInt(st.nextToken());
            if(n == 1){
                swt[i] = true;
            }else
                swt[i] = false;
        }
        int stu_num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        for(int i=0;i<stu_num;i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(gender == 1){
                for(int j=1;j<=sw_num;j++){
                    if(j % num == 0){
                        swt[j] = !swt[j];
                    }
                }
            }else{
                swt[num] = !swt[num];
                int a = 0;
                while(true){
                    a++;
                    if(num + a <= sw_num && num - a > 0 && swt[num+a] == swt[num-a]){
                        swt[num+a] = !swt[num+a];
                        swt[num-a] = !swt[num-a];
                    }else{
                        break;
                    }
                }
            }
        }

        for(int i=1;i<=sw_num;i++) {
            
            if (swt[i]) {
                System.out.print("1 ");
            } else
                System.out.print("0 ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }

    }
}
