public class Insert_Position {
    public static void main(String[] args) {
       int[] nums = {1,3,5,6};
       int rs=searchInsert(nums,2);
        System.out.println(rs);
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int res=-1;
        int s=0,mid;
        int end= nums.length-1;
        while(s<=end){
            mid=s+(end-s)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return s;
    }
}
