class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        String str= s.replaceAll("[^a-z0-9]","");
        char[] ch = str.toCharArray();
        int left=0;
        int right = ch.length-1;
        while(left< right){
            if(ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
