// right rotate array by one position 


import java.util.*;
class RotateRight{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array element :");
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
		}
	int arr1[]=new int[n];
	
	
	for(int i=0;i<n-1;i++){
		arr1[i+1]=arr[i];
	}
	arr1[0]=arr[n-1];
	System.out.println("the right rotated array is:");
	for(int i=0;i<n;i++){
		System.out.println(arr1[i]);
		}

	}

}


/*
Enter the size of array:
3
enter the array element :
11
22
33
the right rotated array is:
33
11
22
*/