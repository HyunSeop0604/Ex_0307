package week_exam;

import java.util.Scanner;

public class Ex4_week 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int su1 = sc.nextInt();
		System.out.print("수2: ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자: ");
		String op = sc.next();
		
		if(op.equals("+"))
		{
			System.out.printf("%d + %d = %d",su1,su2,su1+su2);	
		}
		else if(op.equals("-"))
		{
			System.out.printf("%d - %d = %d",su1,su2,su1-su2);	
		}
		else if(op.equals("*"))
		{
			System.out.printf("%d x %d = %d",su1,su2,su1*su2);
		}
		else if(op.equals("/"))
		{
			System.out.printf("%d / %d = %.1f",su1,su2,(float)su1/su2);
		}
		else
		{
			System.out.println("올바른 연산자를 입력하세요.");
		}
		
	}//main
}
