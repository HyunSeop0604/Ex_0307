package week_exam;

public class Ex1_week 
{
	public static void main(String[] args) 
	{
		int apple=7,orange=5,pear=5;
		
		int total = apple+orange+pear;
		
		System.out.printf("하루에 생상되는 과일의 총량: %d\n",total);
		System.out.printf("시간당 생성되는 과일의 총량: %.1f",(float)total/24);
		
	}//main
}
