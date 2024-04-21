I decided the easiest way to solve this problem is to compare each character of string s and try to find it in string t. I added some edge causes such as if one of the strings were null and the other wasn't and if they are not the same length, they cannot be anagrams. I also made the decision to return true when both strings were null. 

I really like the fact that in python you can write "if char not in t". I think the time complexity is O(n).
