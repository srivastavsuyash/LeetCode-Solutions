class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int weight : weights){
            min = Math.max(min, weight);
            max += weight;
        }
        while(min < max){
            int mid = min + (max - min)/2;
            int requiredDays = 1;
            int currentWeight = 0;
            for(int weight : weights){
                if(currentWeight + weight > mid){
                    requiredDays++;
                    currentWeight = 0;
                }
                currentWeight += weight;
            }
            if(requiredDays > days){
                min = mid + 1;
            }
            else{
                max = mid;
            }
        }
        return min;
    }
}