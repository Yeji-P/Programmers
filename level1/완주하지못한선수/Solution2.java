package level1.완주하지못한선수;

import java.util.HashMap;

public class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) { 
        	//
        	if(hm.get(player) == null)
        		hm.put(player, 1);
        	else
        		hm.put(player, hm.get(player)+1);
        	//hm.put(player, hm.getOrDefault(player, 0) + 1); 한 줄로 간단하게 나타낼 수 있다.
        	
        }
        for (String player : completion) {
        	System.out.println(hm.get(player)-1);
        	hm.put(player, hm.get(player) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}