public class Recursion_Fibbo {

    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans=fibo(n-2)+fibo(n-1);
        return ans;
    }
    public static void print(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print(n--);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=3;
        int[] i = new int[0];
        if(i==null){
            
        }
        print(3);
//        int n=10;
//        for(int i=0;i<n;i++){
//            System.out.print(fibo(i)+" ");
//        }

    }
}
