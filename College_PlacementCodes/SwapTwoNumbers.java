import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1=sc.nextInt();
        System.out.println("enter the second number :");
        int num2=sc.nextInt();

        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1:"+num1);
        System.out.println("num2 :"+num2);
    }
}

/*
enter the first number : 
5
enter the second number :
10
num1:10
num2 :5


enter the first number : 
33
enter the second number :
12
num1:12
num2 :33s
*/
