public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] input=new int[]{10,12,25,11,26};
        System.out.println(maxArea(input));
    }
    public static int maxArea(int[] height) {
        int i=0;
        int h=0,w=0;
        int vol=0;

        while(i<height.length){
            int j=i+1;
            while(j<height.length){
                w=j-i;
                h=Math.min(height[i],height[j]);

                if(h*w>vol){
                    vol=h*w;
                }

                j++;
            }
            i++;
        }
        return vol;
    }

    public int maxArea2(int[] height) {
        int max=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int wt=rp-lp;
            int Curr=ht*wt;
            max = Math.max(max,Curr);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }
}
