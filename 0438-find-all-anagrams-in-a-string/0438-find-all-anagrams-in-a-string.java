class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        int m = s.length();
        List<Integer> ans = new ArrayList<>();
        if(n > m){
            return ans;
        }
        char[] arr1 = p.toCharArray();
        Arrays.sort(arr1);
        String sortedP = new String(arr1);
        for(int i=0; i<=m-n; i++){
            String window = s.substring(i, i+n);
            char[] arr2 = window.toCharArray();
            Arrays.sort(arr2);
            String sortedS = new String(arr2);
            if(sortedP.equals(sortedS)){
                ans.add(i);
            }
        }
        return ans;
    }
}