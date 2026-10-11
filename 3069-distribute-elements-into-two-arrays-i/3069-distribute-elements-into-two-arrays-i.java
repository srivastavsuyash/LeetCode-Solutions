// class Solution {
//     public int[] resultArray(int[] nums) {
//         int n = nums.length;
//         int[] arr1 = new int[n];
//         int[] arr2 = new int[n];
//         int i=0, j=0;
//         arr1[i++] = nums[0];
//         arr2[j++] = nums[1];
//         for(int k=2; k<n; k++){
//             if(arr1[i-1] > arr2[j-1]){
//                 arr1[i++] = nums[k];
//             }
//             else{
//                 arr2[j++] = nums[k];
//             }
//         }
//         int[] ans = new int[n];
//         int index = 0;
//         for(int k=0; k<i; k++){
//             ans[index++] = arr1[k];
//         }
//         for(int k=0; k<j; k++){
//             ans[index++] = arr2[k];
//         }
//         return ans;
//     }
// }

import java.util.Arrays;

class Solution {
public int[] resultArray(int[] nums) {
int n = nums.length;

    int[] arr1 = new int[n];
    int[] arr2 = new int[n];

    int i1 = 0;
    int i2 = 0;

    // First element goes into arr1
    arr1[i1++] = nums[0];

    // Second element goes into arr2
    arr2[i2++] = nums[1];

    // Process the remaining elements
    for (int i = 2; i < n; i++) {
        if (arr1[i1 - 1] > arr2[i2 - 1]) {
            arr1[i1++] = nums[i];
        } else {
            arr2[i2++] = nums[i];
        }
    }

    // Create the result array
    int[] result = new int[n];
    int index = 0;

    // Copy arr1 into result
    for (int i = 0; i < i1; i++) {
        result[index++] = arr1[i];
    }

    // Copy arr2 into result
    for (int i = 0; i < i2; i++) {
        result[index++] = arr2[i];
    }

    return result;
}
}

