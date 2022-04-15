class Solution {
    private static int CHARACTER_RANGE= 256;

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = 0;
        String temp = "";

        while(right <= s.length()) {
            temp = s.substring(left, right);
            if(isAnagram(temp, p)) {
                result.add(left);
                left++;
                right++;
                continue;
            }
			//if the window meets length of p, we move the left pointer
            if (right-left == p.length()) {
                left++;
            }
			//Else always move the right pointer
            right++;
        }

        return result;
    }

   
    private boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}