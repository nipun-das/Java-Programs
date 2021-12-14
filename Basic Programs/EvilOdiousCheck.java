package com.JavaPrograms2;

import java.util.Scanner;

class EvilOdious{
	int i,num,count=0;
	int a[] = new int [8];
	EvilOdious(int num){
		this.num=num;
	}

	void method(){
		for(i=0;i<8;i++)
		{
			a[i]=num%2;
			num=num/2;
			if(a[i]==1)
			{
				count++;
			}	
		}
		System.out.print("Binary is : ");
		for(i=7;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	
		if(count%2==0){
			System.out.println("\nEvil Number!");	
		}
		else
		{
			System.out.println("\nOdious Number!");		
		}
	}
}

class EvilOdiousCheck{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		EvilOdious obj = new EvilOdious(n);
		obj.method();
	}
}
