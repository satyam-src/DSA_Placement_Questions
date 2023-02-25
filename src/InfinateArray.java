public class InfinateArray {
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int result=searchElement(arr,10);
        System.out.println(result);
    }
    static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int findIndex = -1;
        boolean isFind=false;
        while(!isFind) {
            if (target > arr[end]) {
                int temp=end+1;
                end=end+(end-start+1)*2;
                start=temp;
            } else {
                findIndex=searchElementWithRange(arr,target,start,end);
                isFind=true;
            }
        }
        return findIndex;
    }
    static int searchElementWithRange(int[] arr, int target,int start,int end){
        int mid=-1;
        end=arr.length-1;
        while (start < end) {
           mid=start+(end-start)/2;
           if(target<arr[mid]){
               end-=1;
           }
           else if(target>arr[mid]){
               start+=1;
           }
           else {
               return mid;
           }
        }
        return mid;
    }

}
