import java.util.*;
public class NumberPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
        if(original==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

/*
enter the number :
121
121
palindrome


enter the number :
321
123
not palindrome
*/
