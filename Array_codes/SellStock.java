// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
import java.util.*;

class SellStock{
	public void profit(int[] arr){
		int sum=0;
		int total=0;
	for(int i=0;i<arr.length-1;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				sum=arr[j]-arr[i];
			if(sum>total){
			total=sum;
				}
			  }
			}
		}
	System.out.println(" the maximum profit is :" + total);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arr size :");
			int n=sc.nextInt();
		System.out.println(" Enter the values in array :");
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	
		SellStock s=new SellStock();
			s.profit(arr);
	}
}

/*
Enter the arr size :
4
 Enter the values in array :
2
4
6
1
 the maximum profit is :4
*/


