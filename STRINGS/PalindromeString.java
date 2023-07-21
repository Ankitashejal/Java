package STRINGS;

public class PalindromeString {
    public static boolean ispalindrome(String args[]){
      java.lang.String str;
      str = null;
    for(int i= 0; i<str.length()/2 ; i++){
        int n = str.length();
        if(str.charAt(i) != str.charAt(n-1-i)){
            //not a palindrome
            return false;
        }

      }
      return true;
    }

    public static void main(java.lang.String[] args) {
        java.lang.String str = "noon";
        System.out.println(ispalindrome(str));
    }
}
