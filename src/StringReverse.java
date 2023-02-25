import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "a good   example";
        String ans=reverseWords(str);
        System.out.println(ans);
    }

    static String reverseWords(String s) {

        String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; --i){
            str.append(words[i] + " ");
        }

        return str.toString().trim();
    }

    static String reverse_String(String str){
        if(str==null || str.length()==0){
            return "";
        }

        String[] Words=str.trim().split(" ");

        String[] result=new String[Words.length];
        for(int i=Words.length-1,j=0;i>=0;i--){
            result[j]=Words[i];
            j++;
        }
        String ans="";
        for (int i=0;i<result.length;i++){
            if(result[i]==""){

            }
            else {
                ans = ans + result[i].trim() + " ";
            }
        }
        return ans.trim();
    }
}
