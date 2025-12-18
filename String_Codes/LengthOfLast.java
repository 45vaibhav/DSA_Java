// i want to find the length of last word of string

import java.util.*;

class LengthOfLast{
		public void length(String s){
			int count=0;
			String str=s.trim();
			for(int i=str.length()-1;i>=0;i--){
				if(str.charAt(i)!=' '){
					count++;
			}else{
				break;
			}
		}
		System.out.println("the lenght of last word is :" +count);
	}

		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println(" enter the String :");
			String s=sc.nextLine();
		
			LengthOfLast l=new LengthOfLast();
				l.length(s);
		}
}


/*
enter the String :
hello vaibhav
the lenght of last word is :7
*/