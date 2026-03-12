import java.util.*;
public class AmstrongNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int count=0;
        int original=n;
        while(n!=0){
            n/=10;
            count++;
            
        }
        // System.out.println(count);
        while(original!=0){
            int rem=original%10;
            sum+=Math.pow(rem, count);
            original/=10;
        }

        if(temp==sum){
            System.out.println("amstrong ");
        }else{
            System.out.println("not amstrong ");
        }
    }
}

/*
enter the number :
153
amstrong 


enter the number :
12
not amstrong 
*/
