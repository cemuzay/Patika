package src.Mathrandom;

public class palindrome {
   static boolean ispalindrome(String str){
       int i=0;
       int j=str.length()-1;
        while (i<j){
            if(str.charAt(i) !=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
   }
    static boolean ispalindrome2(String str){
       String reverse="";
       for(int i=str.length()-1;i>=0;i--){
        reverse=reverse+str.charAt(i);
       }
     return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(ispalindrome("kayak"));
        System.out.println(ispalindrome2("kayak"));
    }
}
