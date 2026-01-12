//Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

import java.util.*;

class TitleNumber{
	void title(String title){
		int value=0;
		int sum=0;
	for(int i=0;i<title.length();i++){
		value=(int)title.charAt(i)-64;
	
		sum=sum*26+value;
		}
	System.out.println("the total sum of string is :"+sum);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the string :");
		String title=sc.nextLine();
	
		TitleNumber t=new TitleNumber();
			t.title(title);
	}

}


/*
enetr the string :
ZY
the total sum of string is :701
*/