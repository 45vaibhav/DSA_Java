//add one element in array ata last and increase addition of array by 1

import java.util.*;
class PlusOne {
    public int[] plusOne(int[] digits) {
            int rem=0;
            for(int i=0;i<digits.length;i++){
                rem=rem*10+digits[i];
            }
            rem=rem+1;
          if(digits[digits.length-1]==9){
            int arr[]=new int[digits.length+1];
            for(int i=0;i<arr.length;i++){
            int temp=rem%10;
            arr[i]=temp;
                temp=0;
                rem=rem/10;
            
            }
            int start = 0, end = arr.length - 1;
            while (start < end) {
             int temp = arr[start];
            arr[start] = arr[end];
             arr[end] = temp;
            start++;
             end--;
         }
         return arr;
         }else{
             int arr[]=new int[digits.length];
            for(int i=0;i<arr.length;i++){
            int temp=rem%10;
            arr[i]=temp;
            temp=0;
            rem=rem/10;
          }
         int start = 0, end = arr.length - 1;

         while (start < end) {
         int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
	System.out.println(Arrays.toString(arr));
     return arr;
     }
    }
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array :");
	int n=sc.nextInt();
	int digits[]=new int[n];
	System.out.println("Enter the array element :");
	for(int i=0;i<n;i++){
		digits[i]=sc.nextInt();
		}
	PlusOne p=new PlusOne();
		p.plusOne(digits);
	}

}

/*
Enter the size of array :
4
Enter the array element :
5
3
6
1
[5, 3, 6, 2]
*/
