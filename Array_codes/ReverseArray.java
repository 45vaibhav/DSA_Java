//Reverse an array 
import java.util.*;
class ReverseArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elments of Array:");
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[n-1-i];
		}
		System.out.println("the reverse array is :");
		for(int i=0;i<arr.length;i++){
		System.out.println(arr1[i]);
		}
		
	}
}

/*
enter the size of array :
3
Enter the elments of Array:
11
22
33
the reverse array is :
33
22
11
*/