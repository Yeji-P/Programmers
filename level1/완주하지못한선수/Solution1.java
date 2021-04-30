//Arrays.sort를 이용한 방법 

package level1.완주하지못한선수;

import java.util.*;

public class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                return answer;
            }
        }
        answer = participant[i];
        return answer;
    }
}