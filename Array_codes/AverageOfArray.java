import java.util.*;
class AverageOfArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		double average=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++){
			sum+=arr[i];
			}
			average=sum/n;
		System.out.println("  average of array elements are:"+average);
		}
	
	}