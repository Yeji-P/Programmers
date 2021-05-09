package level1.예산;

import java.util.*;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<d.length-1; i++){
            for(int j=i+1; j<d.length;j++){
                if(d[i]>d[j]){
                    int tmp = d[i];
                    d[i] = d[j];
                     d[j] = tmp;
                }
            }
        } // <= Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget)
                return answer;
            answer++;
        }
        
        return answer;
    }
}