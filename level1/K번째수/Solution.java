package level1.K번째수;

import java.util.*;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[][] sub = new int[commands.length][array.length];
        
        for(int i=0; i<commands.length; i++){
            sub[i] = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(sub[i]);            
            answer[i] = sub[i][commands[i][2]-1];
        }
        return answer;
    }
}