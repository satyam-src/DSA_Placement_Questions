public class SellBuy_Stocks {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        int result=maxProfit(arr);
        System.out.println(result);
    }
    public static int maxProfit(int prices[]){
        int profit=0;
        int max_Profit=0,min=prices[0],max=prices[0];
        for(int i=0;i<prices.length;i++){
           if(prices[i]<min){
               min=prices[i];
           }
           profit=prices[i]-min;

           if(profit>max_Profit){
               max_Profit=profit;
           }

        }
        return max_Profit;
    }
}
