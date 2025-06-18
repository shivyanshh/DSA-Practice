package Arrays0;

public class MaxProfitToBuySellStock {
    public static void main(String[] args) {
        // int[] prices = {7,1,5,3,6,4}
        int[] prices = {7,6,4,3,1};
        Solution3 obj = new Solution3();
        int profit = obj.MaxProfit(prices);
        System.out.println("Max profit is : "+ profit);
    }
}
class Solution3{
    public int MaxProfit(int[] prices){
        int max = 0;
        for(int i= 0;i<prices.length;i++){
            for(int j = i+1;j<prices.length;j++){
                int x = prices[j]-prices[i];
                if(x>max){
                    max = x;
                }
            }
        }
        if(max>0){
            return max;
        }
        else{
            return 0;
        }
    }
}
