// Time Complexity :O(n)
// Space Complexity :O(1) //only 26 characters are to be stored so constant time 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> sMap=new HashMap<>();
        HashSet<Character> set=new HashSet<>(); 
        for(int i=0; i<s.length(); i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
                if(set.contains(tChar)) return false; //return false if present
                else set.add(tChar);
            }
            else if(sMap.get(sChar)!=tChar)
                 return false;
        }
        return true;
    }
}