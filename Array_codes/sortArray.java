import java.util.*;
class ArraySort{
	public static void main(String arer[]){
		int arr[]={11,3,55,33,4};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
			int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			 arr1[i]=arr[i];
		}
		int secondMax=arr1[arr1.length-2];
		int secondSmall=arr1[1];
		System.out.println("second Largest Value :"+secondMax);
			System.out.println("second small Value :"+secondSmall);

	}
}