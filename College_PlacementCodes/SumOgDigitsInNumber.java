import java.util.Scanner;

public class SumOgDigitsInNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;

        }
        System.out.println("the sum of all digits are : "+sum);
    }
}

/*
enter the number : 
136
the sum of all digits are : 10


enter the number : 
48
the sum of all digits are : 12
*/
