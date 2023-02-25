public class Factorial {
    public static void main(String[] args) {
        int ans=fact_Recursion(10);
        System.out.println(ans);
    }
    static int fact_Recursion(int n){
        if(n==1 || n==0) {
            return n;
        }
        int result=0;

        result=n*fact_Recursion(n-1);
        return result;
    }
}
