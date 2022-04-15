import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        String prefix = "";
        Map tmp = new HashMap();
        for (String key : phone_book) tmp.put(key, 0);
        for(int i = 0; i< phone_book.length; i++) {
            prefix = phone_book[i];
            for(int j = 1; j< prefix.length(); j++){
                if(tmp.containsKey(prefix.substring(0, j))) return false;
            }
        }
        return true;
    }
}