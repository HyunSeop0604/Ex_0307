package week_exam;

public class Ex9_week 
{
	public static void main(String[] args) 
	{
		//1 2 3 4 5 6 7 8 9 10
		
		
		for(int i = 1; i<= 10; i++)
		{
			for(int j = 0 ; j < 10; j++)
			{
				int sum = 0;
				sum = i + j;
				if(sum > 10)
				{
					sum-=10;
				}
				System.out.printf("%d ",sum);
			}//inner
			System.out.println();
		}//outer
		
	}//main
}
