package week_exam;

import java.util.Scanner;

public class Ex10_week 
{
	public static void main(String[] args) 
	{
		//키보드에서 정수 두개를 입력받고
		//입력 받은 수1 -수2 까지의 합을 계산하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");
		int su1 = sc.nextInt();
		System.out.print("수2 :");
		int su2 = sc.nextInt();
		int sum=0;
		
		if(su1>su2)
		{
			int temp = su1;
			su1=su2;
			su2=temp;
		}
		
		for(int i = su1; i <= su2; i++)
		{
			sum+= i;
		}
		System.out.printf("결과 : %d",sum);
	}//main
}
