class Solution(object):
    def isPalindrome(self, x):
        return True if str(x) == str(x)[::-1] else False

#Runtime: 52 ms, faster than 67.57% of Python online submissions for Palindrome Number.
#Memory Usage: 13.5 MB, less than 9.97% of Python online submissions for Palindrome Number.