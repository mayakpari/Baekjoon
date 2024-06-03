import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        Deque<Integer> stack = new ArrayDeque<>();
        int before = 0;
        stack.push(0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(0);
            } else if (arr[i] == ')') {
                before = stack.pop();
                stack.push(stack.pop() + before);
            } else if (arr[i] >= '2' && arr[i] <= '9') {
                stack.push(stack.pop() + before * (arr[i] - '0' - 1));
            } else {
                if (arr[i] == 'H') before = 1;
                else if (arr[i] == 'C') before = 12;
                else before = 16;

                stack.push(stack.pop() + before);
            }
        }

        System.out.println(stack.pop());
    }
}