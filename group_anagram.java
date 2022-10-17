/* 

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


examples: 

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


Input: strs = [""]
Output: [[""]]


Input: strs = ["a"]
Output: [["a"]]



Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.


*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String temp = strs[i];
            char[] c = temp.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(map.containsKey(sorted)){
                List<String> t = map.get(sorted);
                t.add(strs[i]);
                map.put(sorted, t);
            }
            else{
                map.put(sorted, new ArrayList());
                map.get(sorted).add(strs[i]);
            }
        }
        return new ArrayList(map.values());
    }
}
