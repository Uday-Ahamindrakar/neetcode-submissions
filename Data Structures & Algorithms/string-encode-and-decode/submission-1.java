class Solution {

    public String encode(List<String> strs) {
        
       StringBuilder s = new StringBuilder();
       
       for(String str : strs){
        s.append(str.length()).append("#").append(str);
       }
       return s.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while(i < str.length()){

            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            int start = j + 1;
            int end = start + len;

            result.add(str.substring(start, end));
            i = end;
        }

        return result;
        
    }
}
