class Solution {
    public boolean isAnagram(String s, String t) {

HashMap<Character,Integer> map1= new HashMap<>();
HashMap<Character,Integer> map2= new HashMap<>();
for(int i=0;i<s.length();i++){
    char ch= s.charAt((i));
    map1.put(ch,map1.getOrDefault(ch,0)+1);
}
for(int i=0;i<t.length();i++){
    map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
}
return map1.equals(map2);
    }
}
