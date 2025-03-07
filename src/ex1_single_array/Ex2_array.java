package ex1_single_array;

import java.util.Scanner;

public class Ex2_array 
{
	public static void main(String[] args) 
	{
		int[] ar = new int[3];
		
//		ar[0]=100;
//		ar[1]=200;
//		ar[2]=300;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < ar.length; i++)
		{
			ar[i]=(i+1)*100;
			System.out.println(ar[i]);
		}
		System.out.println("---------------------------");
		
	}//main
}
