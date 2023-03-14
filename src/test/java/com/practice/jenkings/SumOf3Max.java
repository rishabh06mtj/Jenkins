package com.practice.jenkings;

public class SumOf3Max {
	public static void main(String[] args) {
		int ar[]= {2,5,8,12,0,4,16,15};
		for (int i = 0; i < ar.length; i++)
		{
			for (int j =i+1; j < ar.length; j++)
			{
				int temp=0;
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		int prod=1;
		for (int i = 0; i <3; i++)
		{
			prod=prod*ar[i];
		}
		System.out.println(prod);
	}
}
