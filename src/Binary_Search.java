import java.util.Scanner;

public class Binary_Search {
    int binary_index(int[] arr,int low,int high,int x){
        int mid=(low+high)/2;
        while(low<=high){
            if (arr[mid]==x){
                return mid;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,21,23,32,34,47,56};
        Binary_Search obj=new Binary_Search();
        int low=0;
        int high=arr.length-1;
        int x= sc.nextInt();
        //System.out.println(Integer.MIN_VALUE);
        int result=obj.binary_index(arr,low,high,x);
        if(result==-1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element at Index : "+ result);
        }
    }
}

