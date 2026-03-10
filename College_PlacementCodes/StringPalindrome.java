import java.util.*;

public class StringPalindrome {
       public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string :");
    String s=sc.next();
    int n=s.length();
    String reverse="";
    for(int i=n-1;i>=0;i--){
       reverse=reverse+s.charAt(i);
    }
 if(s.equals(reverse)){
    System.out.println("palindrome");
 }else{
    System.out.println("not palindrome :");
 }
}


}

/*
enter the string :
abccba
palindrome


enter the string :
abcba
palindrome


enter the string :
abccdba
not palindrome :
*/
