package week_exam;

import java.util.Scanner;

public class Ex5_week 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = sc.nextInt();
		
		System.out.print((year % 4 == 0 && year % 100 !=0) || year % 400 == 0 ? year+"년은 윤년입니다.":year+"년은 평년입니다.");
		
	}//main
}
