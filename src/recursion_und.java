public class recursion_und {
    public static void main(String[] args) {
//        int sum=sum(10);
//        System.out.println(sum);
        int[] arr={10,23,24,26,29,31,34,37,45,49,50,56,59};
        int result=binarySearchRecusion(arr,595,0,arr.length-1);
        System.out.println(result);

    }

    static int binarySearchRecusion(int[] arr,int t,int s,int e){
        int index=-1;

        if(arr==null || arr.length==0 || s>e){
            return -1;
        }

        int mid=s+(e-s)/2 ;

        if(arr[mid]==t){
            return mid;
        }

        if(t>arr[mid]){
            return binarySearchRecusion(arr,t,mid+1,e);
        }
        return binarySearchRecusion(arr,t,s,mid-1);

    }







    static  int sum(int n){
        if(n==0){
            return 0;
        }
        int result=n+sum(n-1);
        return result;
    }
}
