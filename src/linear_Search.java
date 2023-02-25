import java.util.Scanner;

public class linear_Search {
    int linear(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,21,23,98,56,68,89,91,25};
        int x=sc.nextInt();
        linear_Search obj=new linear_Search();
        int result=obj.linear(arr,x);
        if(result==-1){
            System.out.println("Element Not FOund");
        }
        else{
            System.out.println("Element at Index : "+ result);
        }
    }
}
