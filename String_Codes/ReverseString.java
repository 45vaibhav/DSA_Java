// i want to reverse the array of characters 

import java.util.*;

class ReverseString{
	public void reverse(char arr[]){
		int left=0;
		int right=arr.length-1;
		while(left<right){
			 char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;

			right--;
			left++;
		}
	System.out.println("the reverse String is :");
	System.out.println(Arrays.toString(arr));
	}

public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.next();
		char arr[]=s.toCharArray();

		ReverseString r=new ReverseString();
			r.reverse(arr);	
	}

}

/*
Enter the string :
vaibhav
String to char array elemant :
the reverse String is :
[v, a, h, b, i, a, v]
*/