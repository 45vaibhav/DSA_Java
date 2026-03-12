import java.util.Scanner;

public class FactorialIterrative {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of numer is :"+fact);
    }
}

/*
enter the number :
5
the factorial of numer is :120


enter the number :
4
the factorial of numer is :24s
*/
