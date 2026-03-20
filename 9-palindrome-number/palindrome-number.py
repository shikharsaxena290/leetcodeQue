class Solution(object):
    def isPalindrome(self, x):
        if x>=0:
            result=str(x)
            result=result[::-1]
            if int(result)==x:
                return True
            else:
                return False
        else:
            return False