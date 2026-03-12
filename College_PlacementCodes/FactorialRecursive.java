import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int ans=fun(n);
        System.out.println("the factorial of the number is :"+ans);
    }

    static int fun(int n){
        if(n==1){
            return 1;
        }
        int val=fun(n-1);
        return val*n;
    }
}

/*
enter the number :
4
the factorial of the number is :24

enter the number :
6
the factorial of the number is :720s
*/
