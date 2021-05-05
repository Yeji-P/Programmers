package level1.로또의최고순위와최저순위;

import java.util.*;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int right = 0;
        int zero = 0;
        
        for(int i : lottos){
            if(i == 0){
                    zero++;
                    continue;
            }
            for(int j : win_nums){
                if(i == j)
                    right++;
            }
        }
        
        answer[0] = Math.min(7-(right+zero), 6);
        answer[1] = Math.min(7-right, 6);
        
        return answer;
    }
}