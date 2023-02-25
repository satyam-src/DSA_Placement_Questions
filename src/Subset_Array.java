import java.util.ArrayList;
import java.util.List;

public class Subset_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subset_Array(arr));
    }
    static List<List<Integer>> subset_Array(int[] arr){
        List<List<Integer>> main=new ArrayList<>();

        main.add(new ArrayList<>());
        for(int num:arr){
            int n=main.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(main.get(i));
                inner.add(num);
                main.add(inner);
            }
        }
        return main;
    }
}
