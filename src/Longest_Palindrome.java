public class Longest_Palindrome {
    public static void main(String[] args) {
        String s ="ujtofmboiyyrjzbonysurqfxylvhuzzrzqwcjxibhawifptuammlxstcjmcmfvjuphyyfflkcbwimmpehqrqcdqxglqciduhhuhbjnwaaywofljhwzuqsnhyhahtkilwggineoosnqhdluahhkkbcwbupjcuvzlbzocgmkkyhhglqsvrxsgcglfisbzbawitbjwycareuhyxnbvounqdqdaixgqtljpxpyrccagrkdxsdtvgdjlifknczaacdwxropuxelvmcffiollbuekcfkxzdzuobkrgjedueyospuiuwyppgiwhemyhdjhadcabhgtkotqyneioqzbxviebbvqavtvwgyyrjhnlceyedhfechrbhugotqxkndwxukwtnfiqmstaadlsebfopixrkbvetaoycicsdndmztyqnaehnozchrakt";
        String answer=longestPalindrome(s);
        System.out.println(answer);
    }
    public static String longestPalindrome(String s) {
        String ans_palin="";
        for(int i=0;i<s.length();i++){
            String p_Str="";
            String r_Str="";
            int j=i;
            while(j<s.length()){
                p_Str=p_Str+s.charAt(j);
                r_Str=s.charAt(j)+r_Str;
                if(p_Str.equals(r_Str)){
                    if(ans_palin.length()-1<r_Str.length()-1  ){
                        ans_palin=p_Str;
                    }
                    if(ans_palin.length()==s.length()){
                        return ans_palin;
                    }
                }
                j++;
            }
        }
        return ans_palin;
    }
}
