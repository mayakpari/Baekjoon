class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int curr = 0; // 현재 시간
        int time = 0; // 마지막 공격으로부터 지난 시간
        int currHealth = health; // 현재 체력
        for(int i=0;i<attacks.length;i++){
            time = attacks[i][0] - curr - 1; // 몬스터의 공격을 받기까지 걸린 시간
            currHealth += time * bandage[1] + time/bandage[0] * bandage[2]; // 그 동안 회복한 체력
            if(currHealth >= health){ // 초기 체력보다 많아지면 초기체력으로 조정
                currHealth = health;
            }
            currHealth -= attacks[i][1]; // 공격으로 체력 감소
            if(currHealth <= 0){ // 0 이하로 떨어지면 종료
                return -1;
            }
            curr = attacks[i][0]; // 현재 시간 조정
        }
        answer = currHealth;
        return answer;
    }
}