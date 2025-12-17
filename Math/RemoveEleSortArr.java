// remove element form sorted array

import java.util.*;

class RemoveEleSortArr{
	public void remove(int []arr){
		int count=1;
	for(int i=1;i<arr.length;i++){
		if(arr[i]==arr[i-1]){
			arr[count]=arr[i];
			count++;
			}
		}
	for(int i=1;i<=count;i++){
		System.out.println(i);
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();

		System.out.println("Enter the array element :");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
	
	RemoveEleSortArr a=new RemoveEleSortArr();
			a.remove(arr);
	}
}