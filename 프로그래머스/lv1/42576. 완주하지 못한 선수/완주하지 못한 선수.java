import java.util.List;
import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> parArr =  Arrays.asList(participant);
        List<String> comArr =  Arrays.asList(completion);

        parArr.sort(null);
        comArr.sort(null);
        String answer = "";

        int i;
        for(i=0; i< comArr.size(); i++) {
            String par = parArr.get(i);
            String com = comArr.get(i);
            if(!par.equals(com)) {
                answer = par;
                return answer;
            }
        }
        return parArr.get(i);
    }
}