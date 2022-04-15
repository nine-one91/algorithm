import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int firstIndex = commands[i][0];
            int lastIndex = commands[i][1];
            int searchIndex = commands[i][2];
            int[] tmp = Arrays.copyOfRange(array, firstIndex-1, lastIndex);
            Arrays.sort(tmp);
            answer[i] = tmp[searchIndex - 1];
        }

        return answer;
    }
}