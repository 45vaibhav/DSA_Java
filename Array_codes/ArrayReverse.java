import java.util.*;
class ArrayReverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println(" Reverse array elements are:");
		for(int i=n-1;i>=0;i--){
			System.out.println(arr[i]);
			}
		}
	
	}


/*
Enter the size array
3
Enter the array elements:
2
3
4
 Reverse array elements are:
4
3
2

*/