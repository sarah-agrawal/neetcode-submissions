class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (m.containsKey(target - numbers[i])) {
                return new int[]{Math.min(i+1, m.get(target - numbers[i])), 
                                 Math.max(i+1, m.get(target - numbers[i]))};
            }
            m.put(numbers[i], i+1);
        }
        return new int[]{};
    }
}