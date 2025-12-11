import java.util.*;
class CopyArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[i];
			}
		System.out.println("All copy are are following :");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
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
All copy are are following :
11
22
33
44
*/