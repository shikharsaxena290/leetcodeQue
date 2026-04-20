class Solution {
    public boolean isPalindrome(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                out += Character.toLowerCase(s.charAt(i));
            }
        }

        for(int i=0;i<out.length()/2;i++){  
            if(out.charAt(i)!=out.charAt((out.length()-1)-i)){
                return false;
            }
        }
        return true;
    }
}