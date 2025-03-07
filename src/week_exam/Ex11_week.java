package week_exam;

import java.util.Scanner;

public class Ex11_week 
{
	public static void main(String[] args) 
	{
		//키보드에서 정수를 입력받고 그 숫자가 소수인지 아닌지 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		int i;
		for(i = 2; i <=num ; i++)
		{
			if( num % i == 0)
			{
				break;
			}//if
		}//outer
		System.out.printf("%d는 %s니다.",num, i == num? "소수입" : "소수가 아닙");
	}//main
}
