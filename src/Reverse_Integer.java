public class Reverse_Integer {
    public static void main(String[] args) {
        int ans=1534236469;
        int res=reverse(ans);
        System.out.println(res);
    }
    public static int reverse(int x) {
        if(x==0){
            return 0;
        }

        int rev=0,r=0;
        while(x!=0){
            r=x%10;
            rev=rev*10+r;
            if ((rev - r) / 10 != rev)
            { return 0; }
        }
        return rev;
    }
}
