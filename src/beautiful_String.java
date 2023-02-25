public class beautiful_String {
    public static void main(String[] args) {
        String res = reverseWord("  Welcome    to Coding     Ninjas   ");
        System.out.println(res);
    }
    public static String stringreverse(String str){
        StringBuilder s=new StringBuilder(str);
        StringBuilder res=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(c==0 && s.charAt(i)!=' '){
                res.append(s.charAt(i));
            }
            else if (c!=0 && s.charAt(i)!=' '){
                res.append(" ");
                res.append(s.charAt(i));
                c=0;
            }
            else{
                c++;
            }
        }
        String arr[]=res.toString().split(" ");
        s=new StringBuilder();
        for(int i=arr.length-1;i>-1;i--){
            s.append(arr[i]);
            if(i!=0)
                s.append(" ");
        }

        return s.toString().trim();
    }

    public static String reverseWord(String s){

        String[] res=s.split("\\s+");
        StringBuilder ans=new StringBuilder();

        for(int i=res.length-1;i>=0;i--){
            if(res[i]!=""){
                ans.append(res[i]);
                if(i!=0){
                    ans.append(" ");
                }
            }
        }

        return ans.toString().trim();
    }
}
