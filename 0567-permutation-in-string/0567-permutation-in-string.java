class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1 = new String(arr1);
        for(int i=0 ; i <= n2-n1; i++){
            String window = s2.substring(i, i+n1);
            char[] arr2 = window.toCharArray();
            Arrays.sort(arr2);
            String sortedS2 = new String(arr2);
            if(sortedS1.equals(sortedS2)){
                return true;
            }
        }
        return false;
    }
}