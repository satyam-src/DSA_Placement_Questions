public class array_dsa_prb_product {
    public int[] productexample(int[] arr){
        int[] out_arr=new int[arr.length];
        if(arr.length==0){
            return new int[]{0};
        }
        for(int i=0;i<arr.length;i++){
            out_arr[i]=1;
            for(int j=0;j<arr.length;j++){
                if(j!=i) {
                    out_arr[i]=out_arr[i]* arr[j];
                }
            }
        }
        return  out_arr;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{5,4,3,2,1};
        array_dsa_prb_product obj=new array_dsa_prb_product();
        int[] arr=obj.productexample(arr1);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
