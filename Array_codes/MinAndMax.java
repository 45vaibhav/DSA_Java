import java.util.*;
class MinAndMax{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("Max and Min array elements are:");
		for(int i=0;i<n;i++){
			if(arr[i]>max){
			max=arr[i];
			}
			}
		System.out.println(max);
		int min=max;
		for(int i=0;i<n;i++){
			if(arr[i]<min){
			min=arr[i];
			}
			}
		System.out.println(min);
		}
	
	}


/*
Enter the size array
3
Enter the array elements:
44
55
66
Max and Min array elements are:
66
44
*/
