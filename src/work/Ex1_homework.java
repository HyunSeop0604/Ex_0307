package work;

import java.util.Scanner;

public class Ex1_homework 
{
	public static void main(String[] args) 
	{
		
		//키보드에서 입력받은 정수가 소수인지 아닌지를 판단하세요(1은 소수가 아님)
		//--------------------
		//입력 : 7
		//7 소수입니다.
		
		//입력 : 4
		//4 소수가 아닙니다.
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();
        
        int i = 0;
        
        for(i = 2; i <= n; i++)
        {
        	if(n % i == 0)
        	{
        		break;
        	}
        }//for
        if(i==n)
        {
        	System.out.println(n+" 소수입니다.");
        }
        else
        {
        	System.out.println(n+" 소수가 아닙니다.");
        }
        
        System.out.println("---------------------------------------------");
        
        int cnt = 0;
        
        for(int j = 2; j <= n ;j++)
        {
        	if( n % j == 0)
        	{
        		cnt++;
        		
        	}//if
        }//for
        
        if(cnt==1)
        {
        	System.out.println(n+"은(는) 소수 입니다.");
        }
        else
        {
        	System.out.println(n+"은(는) 소수가 아닙다.");
        }
    }//main
}
