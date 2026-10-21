class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!uniqueValues.add(nums[i])){
                return true;
            }
        }
        return false;

        // Set<Integer> unique = Arrays.stream(nums)
        //                 .boxed()
        //                 .collect(Collectors.toSet());

        // if(unique.size() == nums.length){
        //     return false;
        // } else {
        //     return true;
        // }
    }
}