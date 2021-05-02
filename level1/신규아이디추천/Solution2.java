/* 정규표현식을 이용한 방법 */

package level1.신규아이디추천;

import java.util.*;

public class Solution2 {
    public String solution(String new_id) {
        String answer = "";
        String tmp = new_id;
        
        //step1
        tmp = tmp.toLowerCase();
        //step2
        tmp = tmp.replaceAll("[^a-z0-9-_.]","");
        //step3
        tmp = tmp.replaceAll("[.]{2,}",".");
        //step4
        tmp = tmp.replaceAll("^[.]|[.]$","");
        //step5
        if(tmp.equals(""))
            tmp += "a";
        //step6
        if(tmp.length() >= 16){
            tmp = tmp.substring(0,15);
            tmp = tmp.replaceAll("[.]$","");
        }
        //step7
        if(tmp.length() <= 2){
            while(tmp.length() < 3)
                tmp += tmp.charAt(tmp.length()-1);
        }
        
        
        System.out.println(tmp);
        answer = tmp;
        
        return answer;
    }
}