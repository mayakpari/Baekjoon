import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] words1 = sc.nextLine().toCharArray();
        char[] words2 = sc.nextLine().toCharArray();
        int[] alpha = new int[26];
        for (char c : words1) alpha[c-97]++;
        for (char c : words2) alpha[c-97]--;
        System.out.print(Arrays.stream(alpha).map(i->Math.abs(i)).sum());
    }
}