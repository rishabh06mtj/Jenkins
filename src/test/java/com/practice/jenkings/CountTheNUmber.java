package com.practice.jenkings;
import java.util.LinkedHashSet;
public class CountTheNUmber {
	public static void main(String[] args) {
		String s="aaabbcdddf";
		//		boolean[] b=new boolean[s.length()];
		//		for (int i = 0; i < s.length(); i++) 
		//		{
		//			if(b[i]==false)
		//			{   
		//				int count=1;
		//				for (int j =i+1; j <s.length()-1; j++) 
		//				{    
		//					if(s.charAt(i)==s.charAt(j))
		//					{
		//						count++;
		//						b[j]=true;
		//					}
		//				}
		//				if(count>1)
		//					System.out.print(s.charAt(i)+""+count);
		//				else
		//					System.out.print(s.charAt(i));
		//			}
		//		}

		LinkedHashSet<Character>ls =new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			ls.add(s.charAt(i));
		}

		for (Character character : ls)
		{
			int count=0;
			for (int i = 0; i <s.length(); i++) 
			{

				if(character==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(character+""+count);
			}
			else {
				System.out.print(character+""+count);
			}
		}
	}
}
