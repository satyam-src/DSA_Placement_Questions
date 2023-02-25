public class cn_kThCharaterOf {
    public static void main(String[] args) {
//       char ans= kThCharaterOfDecryptedString("a2b3cd3", (long) 8);
        String ans=decodeAtIndex("abc",1);
        System.out.println(ans);
    }
    public static String decodeAtIndex(String s, int k) {
        String temp="";
        String output="",num="";

        for(int i=0;i<s.length();)
        {
            temp="";
            num="";

            while(i<s.length() && s.charAt(i)>='a' && s.charAt(i)<='z'){
                temp += s.charAt(i);
                i++;
            }

            while(i<s.length() && Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
                i++;
            }

            for(int j=1;num!="" && j<=Double.parseDouble(num);j++){
                output+=temp;
                if(output.length()>=k)
                {

                    temp=String.valueOf(output.charAt(k-1));
                    return temp;
                }
            }
            if(Double.parseDouble(num==""?"0":num)<=0){
                output+=temp;
            }
            if(output.length()>=k ){
                if(num!=""){
                    return s;
                }
                temp=String.valueOf(output.charAt(k-1));
                return temp;
            }
        }
        return temp;
    }
    public static char kThCharaterOfDecryptedString(String s, Long k){
        String temp="";
        String output="",num="";

        for(int i=0;i<s.length();)
        {
            temp="";
            num="";

            while(i<s.length() && s.charAt(i)>='a' && s.charAt(i)<='z'){
                temp += s.charAt(i);
                i++;
            }

            while(i<s.length() && Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
                i++;
            }

            for(int j=1;j<=Integer.parseInt(num);j++){
                output+=temp;
                if(output.length()>=k.intValue()){
                    return output.charAt(k.intValue()-1);
                }
            }
            if(output.length()>=k.intValue()){
                return output.charAt(k.intValue()-1);
            }
        }
        return 'P';
    }
    public static char kThCharaterOfDecryptedString2(String s, Long k)
    {
        char[] inputstr=s.toCharArray();
        String dec_Str="",ks="";
        for (char c:inputstr)
        {

            if(Character.isDigit(c)){
                int len=c-'0';
                int l=Character.getNumericValue(c);
                for(int i=1;i<l;i++){
                    dec_Str+=ks;
                }
                ks="";
            }
            else{
                ks+= String.valueOf(c);
                dec_Str+=String.valueOf(c);
            }
            if(dec_Str.length()>=k.intValue()){
                return dec_Str.charAt(k.intValue()-1);
            }
        }

        return 'x';
    }
}
