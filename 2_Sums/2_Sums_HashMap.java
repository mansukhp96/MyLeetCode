class Solution {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException{
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                int[] fin = {map.get(res), i};
                return fin;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Numbers add up to target!");
    }
}