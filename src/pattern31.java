public class pattern31 {
    public static void main(String[] args) {
        drawPattern(5);
    }
    static void drawPattern(int n){


        for(int i=1;i<2*n;i++){
           int num=n;
            for(int j=1;j<2*n;j++){
               System.out.print(num+" ");
               if((j<i && i<=n)){
                   num--;
               }
               else if(j>=2*n-i && i<=n) {
                   num++;
               }
               else if((j<2*n-i && i>n)){
                    num--;
               }
               else if(j>i && j>n){
                    num++;
               }
            }
            System.out.println();
        }
    }
}
