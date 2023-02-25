public class array_stockprofit {
    public int max_profit(int[] arr) {
        int buy=0, sell=0, max_profit = 0;
        int intial=arr[0];
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i] > intial) {
                buy=intial;
                sell=arr[i];
                max_profit+=(sell-buy);
                intial=arr[i];
            }
           else{
                intial=arr[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,5,4,2};
        array_stockprofit obj = new array_stockprofit();
        int profit = obj.max_profit(arr);
        System.out.println("Maximum Profit : " + profit);
    }
}

