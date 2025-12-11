import java.util.*;
class CountOfEvenAndOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int oddSum=0;
		int evenSum=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		//System.out.println(" array elements are:");
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				evenSum+=arr[i];

				}else{
				oddSum+=arr[i];
				}
				
			}
		System.out.println("Even elements sum is :"+evenSum);
		System.out.println("Odd elements sum is :"+oddSum);
		}
	
	}


/*
Enter the size array
4
Enter the array elements:
11
22
33
44
Even elements sum is :66
Odd elements sum is :44

*/