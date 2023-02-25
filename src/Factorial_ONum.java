public class Factorial_ONum {
    public static void main(String[] args) {
        Fact1(60);
    }
    static void Fact(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void Fact1(int num){
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i + " " );
                }
                else {
                    System.out.print(i + " " + num / i+" ");
                }
            }
        }
    }
}
