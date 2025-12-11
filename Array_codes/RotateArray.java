import java.util.*;
class RotateArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n =sc.nextInt();
		int arr[]=new int[n];
	
	System.out.println("enter the array elements :");	
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
	
	int min=arr[0];
	arr[n-1]=min;
	for(int i=0;i<=n-1;i++){
		arr[i]=arr[i+1];
		}
	
	System.out.println(" rotated Array  are :");
	for(int i=0;i<n;i++){
		System.out.println(""+ arr[i]);
		}
		
	}
}