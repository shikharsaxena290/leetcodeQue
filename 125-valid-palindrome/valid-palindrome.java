class Solution {
    public boolean isPalindrome(String s) {
        String out = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                out += Character.toLowerCase(s.charAt(i));
            }
        }

        String rev = new StringBuilder(out).reverse().toString();

        return out.equals(rev);
    }
}