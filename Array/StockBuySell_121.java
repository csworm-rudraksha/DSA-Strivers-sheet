package Array;

public class StockBuySell_121 {
    public int maxProfit(int[] prices) {
        //bruteforce approach
//        int maxPro=Integer.MIN_VALUE;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[j]>prices[i]){
//                    maxPro=Math.max(maxPro , prices[j]-prices[i]);
//                }
//            }
//        }
//        return maxPro;
        int min = Integer.MAX_VALUE;
        int max=0;
        for (int i=0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            max=Math.max(prices[i]-min,max);
        }
        return max;
    }
}
