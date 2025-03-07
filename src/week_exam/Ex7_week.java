package week_exam;

public class Ex7_week 
{
	public static void main(String[] args) 
	{
		//A B C D
		//E F G H
		//I J K L
		
		char c = 'A';
		
		for(int i = 0;i<3;i++)
		{
			
			for(int j = 0;j<4;j++)
			{
				System.out.printf("%c ",c++);
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
