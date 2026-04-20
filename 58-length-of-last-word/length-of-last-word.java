class Solution {
    public int lengthOfLastWord(String s) {
        String word[]=s.split(" ");
        int len=word[word.length-1].length();
        return len;
    }
}