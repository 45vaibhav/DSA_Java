import java.util.*;

class Factors{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number :");
			int n=sc.nextInt();
			double length=Math.sqrt(n);
			ArrayList<Integer>ls=new ArrayList<>();
			for(int i=1;i<=length;i++){
				if(n%i==0){
				int d=n/i;
				if(i==d){
				ls.add(i);
				}else{
				ls.add(i);
				ls.add(d);
				}
			}
			}
		System.out.println(ls);
		}
	}


/*
enter the number :
36
[1, 36, 2, 18, 3, 12, 4, 9, 6]
*/