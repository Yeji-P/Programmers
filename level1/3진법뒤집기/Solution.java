package level1.a3진법뒤집기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ternary = new ArrayList<>();
        
        while(true){
            if(n<3){
                ternary.add(n);
                break;
            }
            ternary.add(n%3);
            n/=3;
        }
        
        for(int i=0; i<ternary.size(); i++){
            answer += Math.pow(3,ternary.size()-i-1)*ternary.get(i);
        }
        
        return answer;
    }
}