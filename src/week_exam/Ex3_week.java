package week_exam;

import java.util.Random;

public class Ex3_week 
{
	public static void main(String[] args) 
	{
		//1~12사이의 난수를 발생시켜 발생된 난수에 해당하는 월이 몇일까지 있는지 출력
		//5월은 31일까지 있습니다.
		
		Random ra = new Random();
		int month = ra.nextInt(12)+1;
		
		switch(month)
		{
		 case 1,3,5,7,8,10,12:
			 System.out.print(month+"월은 31일까지 있습니다."); break;
		 case 4,6,9,11:
			 System.out.print(month+"월은 30일까지 있습니다."); break;
		 case 2:
			 System.out.print(month+"월은 28일까지 있습니다."); break;
		}//switch
		
	}//main
}
