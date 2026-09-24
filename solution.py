class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        d = {}
        for c in word:
            d[c] = 1
        
        ret = 0
        for x in "QWERTYUIOPASDFGHJKLZXCVBNM":
            if x in d and x.lower() in d:
                ret += 1
        
        return ret
