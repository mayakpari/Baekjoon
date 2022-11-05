class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0,y=0;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'p' || ch[i] == 'P'){
                p++;
            }else if(ch[i] == 'y' || ch[i] == 'Y'){
                y++;
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return p==y;
    }
}