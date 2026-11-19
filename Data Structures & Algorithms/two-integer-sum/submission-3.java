class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                int f = i;
                int g = m.get(target-nums[i]);
                if (f < g) {
                    return new int[]{f, g};
                }
                return new int[]{g, f};
            }
            m.put(nums[i], i);
        }
        return new int[]{};
    }
}
