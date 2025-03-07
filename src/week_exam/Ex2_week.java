package week_exam;

import java.util.Scanner;

public class Ex2_week 
{
	public static void main(String[] args) 
	{
		//키보드에서 나이를 입력받고 30이상이면 "드실만큼 드셧군요"
		//그렇지않으면 "좀 더 드셔도 됨"을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(age>=30? "드실만큼 드셨군여": "좀 더 드셔도 됨");
		
	}//main
}
