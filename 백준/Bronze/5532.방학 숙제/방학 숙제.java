import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int allKr = sc.nextInt();
        int allMa = sc.nextInt();
        int oneKr = sc.nextInt();
        int oneMa = sc.nextInt();
        int koDay = 0,maDay = 0;
        if(allKr%oneKr == 0){
            koDay = allKr/oneKr;
        }else
            koDay = allKr/oneKr + 1;
        if(allMa%oneMa == 0){
            maDay = allMa/oneMa;
        }else
            maDay = allMa/oneMa + 1;
        System.out.println(day-Math.max(koDay,maDay));
    }
}