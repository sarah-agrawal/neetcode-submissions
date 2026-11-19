class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                int index = m.get(target - nums[i]);
                if (i < index) { return new int[]{i, index}; }
                return new int[]{index, i};
            }
             m.put(nums[i], i);
        }
        return new int[]{};
    }
}
