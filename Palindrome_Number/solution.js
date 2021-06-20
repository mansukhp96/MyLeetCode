isPalindrome = (x) => {
    if(x.toString().split("").reverse().join("") === x.toString())
        return true;
    else
        return false;
}

//Runtime: 172 ms, faster than 98.86% of JavaScript online submissions for Palindrome Number.
// Memory Usage: 48.1 MB, less than 92.87% of JavaScript online submissions for Palindrome Number.