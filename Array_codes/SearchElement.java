import java.util.*;
class SearchElement{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		
		System.out.println(" the elmemt is searching for  array elements are:");
			int x=sc.nextInt();
		
			int count=0;
		for(int i=0;i<n;i++){
			if(x==arr[i]){
			count++;
		System.out.println("index is :"+i);
			}
			}
			if(count!=1){
			System.out.println("number not found");
			}
		}
	
	}

/*Enter the size array
4
Enter the array elements:
11
22
33
44
 the elmemt is searching for  array elements are:
44
index is :3
*/