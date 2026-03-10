import java.util.*;
public class ReverseString {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string :");
    String s=sc.next();
    int n=s.length();
    String reverse="";
    for(int i=n-1;i>=0;i--){
       reverse=reverse+s.charAt(i);
    }
    System.out.println(reverse);
}
}

/*
enter the string :
vila
aliv

enter the string :
gaurav
varuag
*/
