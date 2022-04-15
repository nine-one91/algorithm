import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
          int[] answer = {};

        int[] student_1 = { 1, 2, 3, 4, 5 };
        int[] student_2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] student_3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int student_1_answer_list = 0;
        int student_2_answer_list = 0;
        int student_3_answer_list = 0;

        for( int i = 0; i < answers.length; i++ ) {
            int student_1_minus_value = (i / 5) >= 1 ? i - (5 * (i / 5)) : i;
            int student_2_minus_value = (i / 8) >= 1 ? i - (8 * (i / 8)) : i;
            int student_3_minus_value = (i / 10) >= 1 ? i - (10 * (i / 10)) : i;

            if(student_1[student_1_minus_value] == answers[i]) {
                ++student_1_answer_list;
            }
            if(student_2[student_2_minus_value] == answers[i]) {
                ++student_2_answer_list;
            }
            if(student_3[student_3_minus_value] == answers[i]) {
                ++student_3_answer_list;
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(student_1_answer_list);
        list.add(student_2_answer_list);
        list.add(student_3_answer_list);
        int max = Collections.max(list);
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == max)
                answerList.add(i + 1);
        }

        answer = answerList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}