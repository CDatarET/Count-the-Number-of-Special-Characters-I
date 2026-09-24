class Solution {
public:
    int numberOfSpecialChars(string word) {
        unordered_map<char, int> map;
        for(int i = 0; i < word.length(); i++){
            map[word[i]] = 1;
        }

        int ret = 0;
        for(char c = 'A'; c <= 'Z'; c++){
            if(map.contains(c) && map.contains((char)(c + 32))){
                ret++;
            }
        }

        return ret;
    }
};
