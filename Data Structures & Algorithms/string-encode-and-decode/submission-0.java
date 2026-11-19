class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String st : strs) {
            s.append(st.length()+"#"+st);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> l = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j+=1;
            }
            int length = Integer.parseInt(str.substring(i, j));
            l.add(str.substring(j+1, j+length+1));
            i = j+1+length;
        }
        return l;
    }
}
