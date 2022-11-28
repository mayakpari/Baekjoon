import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '('){
                stk.push('(');
            }else{
                if(!stk.isEmpty() && stk.peek() == '('){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        if(!stk.isEmpty()){
            answer = false;
        }
        return answer;
    }
}