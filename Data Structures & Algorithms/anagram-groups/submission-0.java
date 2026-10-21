class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> groupPairs = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        String[] actual = strs;

        for(int i = 0; i < strs.length; i++){

            char[] name = strs[i].toCharArray();
            Arrays.sort(name);
            String s = new String(name);    

            groupPairs.computeIfAbsent(s, k -> new ArrayList<>()).add(actual[i]);
        }

        for(List<String> values : groupPairs.values()){
            result.add(values);
        }
        return result;
    }
}
