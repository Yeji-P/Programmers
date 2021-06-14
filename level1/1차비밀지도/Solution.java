package level1.a1차비밀지도;

import java.util.*;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        int[] orCal = new int[arr1.length];
        
        for(int i=0; i<arr1.length; i++)
            orCal[i] = arr1[i] | arr2[i];
        
        for(int i=0; i<orCal.length; i++){
            String s = new String();
            for(int j=n-1; j>=0; j--){
                int tmp = (orCal[i]>>j)%2;
                if(tmp==1)
                    s += "#";
                else
                    s += " ";
            }
            answer[i] = s;
        }
       
        return answer;
    }
}