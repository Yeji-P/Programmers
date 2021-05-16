package level1.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> AddNum = new ArrayList<Integer>();
        
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!AddNum.contains(numbers[i]+numbers[j])){
                    AddNum.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        Collections.sort(AddNum);
        
        answer = new int[AddNum.size()];
        int size=0;
        for(int i:AddNum)
            answer[size++] = i;
        
        return answer;
    }
}