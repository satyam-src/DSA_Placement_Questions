import java.util.ArrayList;
import java.util.List;

public class Phonenumber_STring {
    public static void main(String[] args) {
        pad("","1245");
    }
    public static void pad(String p ,String up){
        if(up.isEmpty()){

            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
            pad(p+ch,up.substring(1));
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> Final=new ArrayList<>();
        if(digits.equals('0') || digits.equals('1') || digits.equals('9')){
            return Final;
        }
        int[] num=new int[digits.length()];
        for(int i=0;i<digits.length();i++){
            num[i]=(int)digits.charAt(i);
        }
        String first="abc";
        String sec="def";
        String ans="";

        for(int i=0;i<first.length();i++){
             ans+=first.charAt(i);
            for(int j=0;j<sec.length();j++){

            }
        }

        return Final;
    }
}
