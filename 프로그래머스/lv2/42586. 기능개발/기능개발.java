import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         int[] answer = {};
        ArrayList<Integer> daysList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];

            int remain = 100 - progress;

            int days = remain / speed;
            if ((remain % speed) > 0) days++;

            daysList.add(days);
        }


        for (int i = 0; i < daysList.size(); i++) {
            int day = daysList.get(i);

            int next = i + 1;
            int count = 1;

            while (next < daysList.size()) {
                if (daysList.get(next) <= day) {
                    i = next;
                    ++count;
                    ++next;
                    continue;
                }
                break;
            }
            answerList.add(count);
        }
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}