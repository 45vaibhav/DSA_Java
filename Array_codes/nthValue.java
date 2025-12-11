import java.util.*;
class ArraySorting{
	public static void main(String arer[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
			int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			 arr1[i]=arr[i];
			
		}
		System.out.print("Enter the index you want value: ");
			int index=sc.nextInt();
		
		
		int value=arr1[index];
		System.out.println(" Value  is:"+value);
			

	}
}

/*
Enter size of an array: 3
1
2
3
[1, 2, 3]
Enter the index you want value: 2
 Value  is:3
*/