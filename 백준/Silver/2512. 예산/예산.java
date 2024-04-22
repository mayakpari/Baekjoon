import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine()); //지방 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr= new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i]; //총합
        }
        Arrays.sort(arr);
        long m= Integer.parseInt(br.readLine()); //총예산

        if(sum<m) System.out.println(arr[n-1]); // 예산요청의 총합이 예산보다 적다면 예산총합에서 젤 큰수 출력
        else{ //예산요청의 총합이 예산보다 크다면
            long start =0;
            long end=arr[n-1];
            long result =0;

            while (start<=end){
                long mid = (start+end)/2;
                long s=0;
                for(long v : arr){
                    if(v>=mid) s+=mid; //값이 상한가 보다 큰것은 상한가로 계산
                    else s+=v; //값이 상한가보다 작은것은 원래 자기 값으로 계산
                }

                if(s>m) end = mid-1;
                else{
                    start = mid+1;
                    result = Math.max(result,mid);
                }
            }
            System.out.println(result);
        }
    }
}