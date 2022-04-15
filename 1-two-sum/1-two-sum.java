class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];            
            if(maps.containsKey(tmp)){
                return new int[]{maps.get(tmp), i};
            }
            maps.put(nums[i],i);
            
        }
        return new int[]{0};
    }
}