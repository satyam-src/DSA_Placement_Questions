import java.util.Scanner;

public class StringComman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        uncomman_Char("satyam gupta");
    }
    static void uncomman_Char(String str){
        if(str==null || str==""){
            System.out.println("");
        }
        str=str.replaceAll("\\s","");

        for(int i=0;i<str.length();i++){
            char sm = str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(j!=i){
                    if(str.charAt(j)==sm){
                        break;
                    }
                    else if(str.charAt(j)!=sm && j==str.length()-1){
                        System.out.print(sm+" ");
                    }

                }else{
                    if(j==str.length()-1 && str.charAt(j)==sm){
                        System.out.print(sm+" ");
                    }
                }
            }
        }
    }
}
