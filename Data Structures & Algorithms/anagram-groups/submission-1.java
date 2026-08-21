class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list = new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        for(String str: strs){
        char[] ch= str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(str);


        }
        list.addAll(map.values());
        return list;
        
    }
}
