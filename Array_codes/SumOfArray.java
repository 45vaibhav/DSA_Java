import java.util.*;
class SumOfArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("sum of array elements are:");
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
			}
		System.out.println(sum);
		}
	
	}


/*
Enter the size array
3
Enter the array elements:
2
3
4
sum of array elements are:
9
*/