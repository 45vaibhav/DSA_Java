import java.util.*;

public class fibonacciSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n =sc.nextInt();
        int start =0;
        int end=start+1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=start+end;
            start=end;
            end=sum;
        }
        System.out.println("the number present at n position is : "+sum);

    }
    
}


/*
enter the number :
5
the number present at n position is : 5


enter the number :
6
the number present at n position is : 8s
*/
