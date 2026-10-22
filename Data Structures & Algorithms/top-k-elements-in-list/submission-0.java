class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        Map<Integer, Integer> result = new HashMap<>();
        int[] returnValue = new int[k];

        for(int num : nums){

            result.put(num, result.getOrDefault(num, 0) + 1);
        } 

        Map<Integer, Integer> sortedValues = result.entrySet()
                                        .stream()
                                        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                                        .collect(Collectors.toMap(
                                            key -> key.getKey(),
                                            value -> value.getValue(),
                                            (a, b) -> a,
                                            () -> new LinkedHashMap<>()

                                        ));

        int i = 0;

        for(Map.Entry<Integer, Integer> map : sortedValues.entrySet()){
            if(i < k){
                returnValue[i] = map.getKey();
                i++;
            } else {
                break;
            }
            
        }
        return returnValue;
    }
}
