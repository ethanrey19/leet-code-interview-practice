class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i],i);
        }

        for(int j = 0; j < nums.length;j++){
            int find = target - nums[j];
            if(map.containsKey(find) && map.get(find) != j){
                return new int [] {j,map.get(find)};
            }
        }
        return new int []{};
    }
}