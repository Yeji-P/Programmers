package level1.실패율;

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> fail = new HashMap<>();
        int cnt = 0;
        int stage = stages.length;
        
        Arrays.sort(stages);
    
        for(int i=1; i<=N; i++){
            cnt = 0;
            for(int j=stages.length-stage; j<stages.length; j++){
                if(i==stages[j])
                    cnt++;
                else break;
            }
            if(stage == 0)
                fail.put(i, 0.0);
            else {
                fail.put(i, cnt/(double)stage);
                stage -= cnt;
            }
        }
        
        ArrayList<Integer> sort_fail = new ArrayList<>(fail.keySet());
        Collections.sort(sort_fail,(o1,o2)->(fail.get(o2).compareTo(fail.get(o1))));
        
        int n=0;
        for(int i:sort_fail)
            answer[n++] = i;
        
        return answer;
    }
}