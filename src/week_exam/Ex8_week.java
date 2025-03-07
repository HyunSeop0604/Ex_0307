package week_exam;

public class Ex8_week 
{
	public static void main(String[] args) 
	{
		//2 - 9까지 구구단 출력하기
		//2 x 1 = 2 
		
		for(int i = 1; i <= 9;i++)
		{
			for(int j = 2; j <= 9 ;j++)
			{
				System.out.printf("%d x %d = %d\t",j,i,j*i);
			}//inner
			System.out.println();
			
		}//outer
		
	}//main
}
