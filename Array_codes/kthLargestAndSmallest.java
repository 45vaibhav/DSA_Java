
//find the kth largest and kth smallest element of array
import java.util.*;
public class kthLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the kth smallest element:");
        int small=sc.nextInt();
        for(int i=n;i>=n-small;i--){
            if(i==n-small){
            System.out.println("kth Small element:"+arr[i]);
            }
            System.out.println("Enter the kth lagest largest");
        }
             int large=sc.nextInt();
        for(int i=0;i<large;i++){
            if(i==large-1){
            System.out.println("kth large   :"+arr[i]);
            }
        }

    }
}

/*
Enter the size of Array :
6
Enter the element of array: 
32
22
1
65
43
12
enter the kth smallest element:
4
Enter the kth lagest largest
Enter the kth lagest largest
Enter the kth lagest largest
Enter the kth lagest largest
kth Small element:22
Enter the kth lagest largest
4
kth large   :32
*/
