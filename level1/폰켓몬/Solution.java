package level1.폰켓몬;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        ArrayList<Integer> poketmon = new ArrayList<>();
        
        for(int i:nums){
            if(!poketmon.contains(i))
                poketmon.add(i);
        }
        
        if(poketmon.size() < answer)
            answer = poketmon.size();
       
        return answer;
    }
}