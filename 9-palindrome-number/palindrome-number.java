class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        if(x>=0){
            while(x>0){
                int digit=x%10;
                rev=(rev*10)+digit;
                x=x/10;
            }
        }
        else{
            return false;
        }
        if(rev==temp){
            return true;
        }else{
            return false;
        }
    }
}