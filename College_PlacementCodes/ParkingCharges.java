/*
CHARGES 

first 2 hour -- 100/hour
Next 3 hour -- 50/hour
Beyond 5 hour -- 20/hour
*/


import java.util.Scanner;

public class ParkingCharges {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hours : ");
        int n=sc.nextInt();

        if(n<=2 && n>0){
            System.out.println("the charges is : "+(100*n));
        }
        else if(n>=3 && n<5){
              System.out.println("the charges is : "+(100*2+ (n-2)*50));
        }else{
              System.out.println("the charges is : "+(100*2+3*50+ (n-5)*20));
        }
    }
}

/*
Enter the hours : 
6
the charges is : 370


Enter the hours : 
4
the charges is : 300
*/
