class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // int n = p.length();
        // int m = s.length();
        // List<Integer> ans = new ArrayList<>();
        // if(n > m){
        //     return ans;
        // }
        // char[] arr1 = p.toCharArray();
        // Arrays.sort(arr1);
        // String sortedP = new String(arr1);
        // for(int i=0; i<=m-n; i++){
        //     String window = s.substring(i, i+n);
        //     char[] arr2 = window.toCharArray();
        //     Arrays.sort(arr2);
        //     String sortedS = new String(arr2);
        //     if(sortedP.equals(sortedS)){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        List<Integer> ans = new ArrayList<>();
        int n = p.length();
        int m = s.length();
        if(n > m){
            return ans;
        }
        int[] freqP = new int[26];
        int[] freqWindow = new int[26];
        for(char ch : p.toCharArray()){
            freqP[ch - 'a']++;
        }
        for(int i=0; i<m; i++){
            freqWindow[s.charAt(i) - 'a']++;
            if(i >= n){
                freqWindow[s.charAt(i-n) - 'a']--;
            }
            if(Arrays.equals(freqP, freqWindow)){
                ans.add(i-n+1);
            }
        }
        return ans;
    }
}