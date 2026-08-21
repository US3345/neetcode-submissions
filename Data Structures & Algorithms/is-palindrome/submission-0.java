class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase();
        st = st.replaceAll("[^a-z0-9]","");
        char[] ch = st.toCharArray();
        int l= ch.length;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!= ch[l- i-1]){
                return false;
            }
        }
        return true;
    }
}
