class Solution {
    public static int digitProduct(int num){
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            product *= digit;
            num /= 10; 
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        int num = n;
        while(true){
            int product = digitProduct(num);
            if(product % t == 0){
                return num;
            }
            num++;
        }
    }
}