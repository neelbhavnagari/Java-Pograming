class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length=0;

    for(
        int i =0; i<s.length(); i++
    ){
        boolean[] seen = new boolean[256];

         for(
        int j =i; i<s.length(); j++
    ){
        char ch = s.charAt(j);

        if(seen[ch]){
            break;

        }
        seen[ch] = true;

        int cu = j-i+1;

        if(cu > max_length) {
            max_length = cu;
        }
    }
    }
        
return max_length;
  


        
    }
}