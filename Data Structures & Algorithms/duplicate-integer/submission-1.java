class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> uniqueValues = new HashSet<>(Arrays.toList(nums));

        // for(int i = 0; i < nums.length; i++){
        //     if(uniqueValues.contains(nums[i])){
        //         return true;
        //     }
        //     uniqueValues.add(nums[i]);
            
        // }
        // return false;

        Set<Integer> unique = Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.toSet());

        if(unique.size() == nums.length){
            return false;
        } else {
            return true;
        }
    }
}