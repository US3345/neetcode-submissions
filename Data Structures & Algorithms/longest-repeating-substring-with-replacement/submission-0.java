class Solution {
    public int characterReplacement(String s, int k) {
    int l=0, r=0,len =0;
    int maxlen =0;
    HashMap<Character,Integer> map = new HashMap<>();
    while(r < s.length()){
        char ch = s.charAt(r);
        map.put(ch,map.getOrDefault(ch,0)+1);
        int mf=0;
        for(int val:map.values()){
            mf = Math.max(mf,val);
        }
        while(((r-l+ 1) - mf)>k){
            char c= s.charAt(l);
            map.put(c,(map.get(c))-1);
            l++;
        }
        int length = r-l+1;
        maxlen = Math.max(maxlen,length);
        r++;

    }
    return maxlen;
    }
}
