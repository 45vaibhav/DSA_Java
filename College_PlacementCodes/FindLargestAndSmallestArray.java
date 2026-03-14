import java.util.Scanner;

public class FindLargestAndSmallestArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
            large=large;
            small=small;
        }

        System.out.println("large :"+large);
        System.out.println("small :"+small);

    }
}



/*
enter the size of array :
5
enter the array element :
4 6 2 8 9
large :9
small :2
*/
