import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] answerList = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            answerList[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(answerList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        if(answerList[0].equals("0")) return "0";
        answer = String.join("", answerList);
    
        return answer;
    }
}