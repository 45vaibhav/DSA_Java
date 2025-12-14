//Gray code 

import java.util.*;
class GrayCode{
	public void  grayCode(int n){
		int mul=1<<n;
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<mul;i++){
			ls.add(i ^ (i>>1));
		}
		System.out.println(ls);
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		GrayCode g=new GrayCode();
			g.grayCode(n);
	}
}


/*
Enter the number :
4
[0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8]
*/