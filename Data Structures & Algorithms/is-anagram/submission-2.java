class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[128]; //can do 26 if all are small 
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }

        for(int i : count){
            if(i != 0 ){
                return false;
            }
        }
        return true;
    }
}

//brute force
// public boolean isAnagram(String s, String t) {
//         char[] s1 = s.toCharArray();
//         char[] s2 = t.toCharArray();

//         Arrays.sort(s1);
//         Arrays.sort(s2);
//         String sortedS1 = new String(s1);
//         String sortedS2 = new String(s2);

//         if(sortedS1.equals(sortedS2)){
//             return true;
//         } else return false;
//     }


//when there are any characters in string
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;

//         HashMap<Character, Integer> map = new HashMap<>();

//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         for (char c : t.toCharArray()) {
//             if (!map.containsKey(c)) return false;

//             map.put(c, map.get(c) - 1);
//             if (map.get(c) == 0) {
//                 map.remove(c);
//             }
//         }

//         return map.isEmpty();
//     }
// }
