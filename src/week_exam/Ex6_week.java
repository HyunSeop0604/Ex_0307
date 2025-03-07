package week_exam;

public class Ex6_week 
{
	public static void main(String[] args) 
	{
		//1 - 10까지의 숫자 중에서 홀수의 합을 계산하여 출력
		//결과 : 
		int sum =0;
		for(int i = 1; i<=10;i++)
		{
			if(i% 2 != 0)
			{
				sum+=i;
			}
		}
		System.out.printf("결과 : %d",sum);
		
		System.out.println();
		int i = 1;
		int sum1=0;
		while(i<=10)
		{
			if(i% 2 != 0) { sum1+=i;}
			i++;
		}//while
		System.out.printf("결과 : %d",sum1);
		System.out.println();
		int num = 0, j=1;
		do
		{
			if(j % 2 != 0) { num+=j;}
			j++;
		}
		while(j<=10);
		
		System.out.printf("결과 : %d",num);
	}//main
}
