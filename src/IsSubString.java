public class IsSubString {
    public static void main(String[] args) {
        boolean ans=isStringHasSubString("bcdbcdbcde");
        System.out.println(ans);
    }
    static boolean isSubstring(String str,String sub )
    {
        boolean ans=false;
        if(str==null || sub==null){
            return ans;
        }

        if(str=="" || sub==""){
            return ans;
        }

        for(int i=0,j=0; i<str.length();i++){
            char ch=sub.charAt(j);
            while (ch == str.charAt(i)) {
                if(ch == str.charAt(i) && j==sub.length()-1) {
                    ans = true;
                    break;
                }
                i++;
                j++;
                ch=sub.charAt(j);
            }
        }
        return ans;
    }

    static boolean isStringHasSubString(String str){
        int l = str.length();
        for(int i=l/2;i>=1;i--) {
            if(l%i==0) {
                int m = l/i;
                String subS = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subS);
                }
                if(sb.toString().equals(str)) return true;
            }
        }
        return false;

    }
}
