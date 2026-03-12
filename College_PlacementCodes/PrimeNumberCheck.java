import java.util.*;
public class PrimeNumberCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("not prime ");
        }else{
            System.out.println("prime ");
        }
    }
}


/*
enter the number :
5
prime


enter the number :
12
not prime 
*/