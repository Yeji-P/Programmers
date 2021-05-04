package level1.모의고사;

import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {}; 
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            if(p1[i%p1.length] == answers[i])
                score[0]++;
            if(p2[i%p2.length] == answers[i])
                score[1]++;
            if(p3[i%p3.length] == answers[i])
                score[2]++;
        }
        
        int max = Math.max(score[0],Math.max(score[1],score[2]));
        List<Integer> pList = new ArrayList<>();
        if(score[0] == max)
            pList.add(1);
        if(score[1] == max)
            pList.add(2);
        if(score[2] == max)
            pList.add(3);
        
        answer = new int[pList.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = pList.get(i);
        
        return answer;
    }
}