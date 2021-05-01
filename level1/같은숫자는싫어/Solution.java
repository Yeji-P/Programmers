package level1.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<Integer>();
        int preNum = 10;
        
        for(int i : arr){
            if(preNum != i)
                al.add(i);
            preNum = i;
        }
        
        answer = new int[al.size()];
        for(int j=0; j<al.size(); j++){
            answer[j] = al.get(j).intValue();
        }
    
        return answer;
    }
}