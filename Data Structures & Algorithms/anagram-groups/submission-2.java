class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> sorted = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!sorted.containsKey(key)) {
               sorted.put(key, new ArrayList<>()); 
            }
            sorted.get(key).add(s);
        }
        for (String s : sorted.keySet()) {
            output.add(sorted.get(s));
        }
        return output;
    }
}
