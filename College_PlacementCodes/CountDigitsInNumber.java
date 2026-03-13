import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            int rem=n%10;
            count++;
            n/=10;
        }
        System.out.println("the all digits are present in numeber is : "+count);
    }
}


/*
enter the number :
136
the all digits are present in numeber is : 3  


enter the number :
58799
the all digits are present in numeber is : 5
*/
