import java.util.Scanner;

public class selection_Sort {
    void selcetion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int low=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[low]>arr[j]){
                    low=j;
                }
            }
            int temp=arr[low];
            arr[low]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={21,33,20,31,17,19,34,29};
        selection_Sort obj = new selection_Sort();
        obj.selcetion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
