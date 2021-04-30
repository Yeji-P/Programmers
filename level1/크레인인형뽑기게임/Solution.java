package level1.크레인인형뽑기게임;

import java.util.*;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack bk = new Stack();
        
        for(int i=0; i<moves.length; i++){
            int n = moves[i]-1;
            for(int j=0; j<board.length; j++){
                if(board[j][n]!=0){
                    if(bk.size()==0)
                        bk.push(board[j][n]);
                    else if((int)bk.get(bk.size()-1) != board[j][n])
                        bk.push(board[j][n]);
                    else{
                        bk.pop();
                        answer +=2;
                        }
                    board[j][n] = 0;
                    break;
                }
                    
            }
            
        }
        return answer;
    }
}