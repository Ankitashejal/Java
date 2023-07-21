package STRINGS;

public class palindromedp {
    public static boolean isPalindrome(java.lang.String str)
    {
       
        java.lang.String rev = "" ;
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        // Input
        java.lang.String str = "ankita";
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
