import java.util.*;
class evenElements{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("Even  index array elements are:");
		for(int i=0;i<n;i++){
			if(i%2==0){
			System.out.println(arr[i]);
			}
			}
		}
	
	}