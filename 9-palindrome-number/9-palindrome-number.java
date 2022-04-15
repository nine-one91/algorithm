class Solution {
    public boolean isPalindrome(int x) {
        String s_x = String.valueOf(x);
        StringBuffer strBuffer = new StringBuffer(); 
        strBuffer.append(s_x);
        if(s_x.equals(strBuffer.reverse().toString())) return true;  
        return false;
    }
}