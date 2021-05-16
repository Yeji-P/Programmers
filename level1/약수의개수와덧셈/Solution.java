package level1.약수의개수와덧셈;

import java.util.*;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> num = new ArrayList<Integer>();
        
        for(int i=left; i<=right; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j ==0)
                    count++;
            }
            if(count%2==0)
                num.add(i);
            else
                num.add(-i);
        }
        
        for(int i=0; i<num.size(); i++)
            answer += num.get(i);
        
        return answer;
    }
}