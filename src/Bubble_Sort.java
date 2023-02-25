import java.util.Scanner;

public class Bubble_Sort {
    public static void print_Array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void bubb_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++) {
               if (arr[j] > arr[j+1])
               {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bubble_Sort obj=new Bubble_Sort();
        int[] arr = { 7,8,3,1,2 };
        obj.bubb_sort(arr);
        print_Array(arr);
    }
}
