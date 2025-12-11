import java.util.*;
class LargestValue{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Largest  element is:"+max);
	}
}

/*Enter the size array
4
Enter the array elements:
11
22
44
33
Largest  element is:44
*/