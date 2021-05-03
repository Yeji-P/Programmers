package level1.체육복;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        
        for(int i : lost)
            student[i-1] -= 1;
        for(int i : reserve)
            student[i-1] += 1;
        
        for(int j=0; j<n; j++){
            if(student[j] < 0){
                if(j > 0 && student[j-1] > 0){
                    student[j-1] -= 1;
                    student[j] += 1;
                }
                else if(j != n-1 && student[j+1] > 0){
                    student[j+1] -= 1;
                    student[j] += 1;
                }
            }
        }
        
        for(int k=0; k<student.length; k++)
            if(student[k] >= 0)
                answer++;
            
        return answer;
    }
}