package level1.소수만들기;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();
        

        for(int i=0; i<nums.length-2; i++)
            for(int j=i+1; j<nums.length-1; j++)
                for(int k=j+1; k<nums.length; k++)
                        al.add(nums[i]+nums[j]+nums[k]);
        
        for(int i:al){
            int j=2;
            for(; j<Math.sqrt(i); j++)
                if(i%j==0)
                    break;
            if(j>Math.sqrt(i))
                answer++;
        }
                    
        return answer;
    }
}