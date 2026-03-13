import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1=sc.nextInt();
        System.out.println("enter the second number :");
        int num2=sc.nextInt();
            int gcd=1;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1%i==0 && num2%i==0){
               gcd=i;
            }
        }
        System.out.println("the GCD is "+gcd);
    }
}

/*
enter the first number :
12
enter the second number :
24
the GCD is 12


enter the first number :
6
enter the second number :
9
the GCD is 3

*/
