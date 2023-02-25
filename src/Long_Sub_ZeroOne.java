import java.util.*;
public class Long_Sub_ZeroOne {
    public static void main(String[] args) {
        int[] input=new int[]{0,0,1,0,0,0,1,1};
        System.out.println(longest_Subs(input));
    }

    public static  int long_Subs_HM(int[] nums){
        int ans = 0;

        HashMap<Integer,Integer> Map=new HashMap<>();
        Map.put(0,-1);

        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i]==0){
                sum+=-1;
            }
            else if(nums[i]==1){
                sum+=1;
            }

            if(Map.containsKey(sum)){
                int idx=Map.get(sum);
                int len=i-idx;

                if(len > ans){
                    ans=len;
                }
            }else{
                Map.put(sum,i);
            }
        }
        return ans;
    }

    public int findMaxLength(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    count = Math.max(count, j - i + 1);
                }
            }
        }
        return count;
    }
    private static int longest_Subs(int[] arr){

        int long_Sub=0,count_Z=0,count_O=0;;
        for(int i=0;i<arr.length;i++){
            count_O=count_Z=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    count_Z+=1;
                }
                else{
                    count_O+=1;
                }
                if(count_O==count_Z){
                    long_Sub=Math.max(long_Sub,j-i+1);
                }
            }

        }
        return long_Sub;
    }
}
