package com.practice.jenkings;
import java.util.LinkedHashSet;

public class PrintVowels {
	public static void main(String[] args) {
		String s="bangaloreee";
		LinkedHashSet<Character>ls =new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		for (Character character : ls) {
			
			int count =0;
			if (character=='u'||character=='a'||character=='e'||character=='o'||character=='i') {

				for(int i=0;i<s.length();i++)
				{

					if(character==s.charAt(i))
					{
						count++;

					}
				}

				if(count>1)
					System.out.println(character);
			}
		}




	}

} 

