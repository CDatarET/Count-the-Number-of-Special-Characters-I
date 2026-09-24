class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            map.put(word.charAt(i), 1);
        }

        int ret = 0;
        for(char c = 'A'; c <= 'Z'; c++){
            if(map.get(c) != null && map.get((char)(c + 32)) != null){
                ret++;
            }
        }

        return ret;
    }
}
