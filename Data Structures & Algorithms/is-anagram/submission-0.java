class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        String sortedS1 = new String(s1);
        String sortedS2 = new String(s2);

        if(sortedS1.equals(sortedS2)){
            return true;
        } else return false;
    }
}
