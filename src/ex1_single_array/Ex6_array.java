package ex1_single_array;

import java.util.Scanner;

public class Ex6_array 
{
	public static void main(String[] args) 
	{
		
		//키보드에서 입력받은 횟수만큼의 결과를 보여주는 
		//피보나치 수열 만들기(배열)
		//길이: 7
		//1 1
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("길이 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if(num >= 2)
		{
			arr[0]=1;
			arr[1]=1;
		}
		
		for(int i = 2 ;i<num;i++)
		{
			arr[i]=arr[i-2]+arr[i-1];
		}
		
		//수열 출력
		for(int data : arr)
		{
			System.out.print(data+" ");
		}
		
		
	}//main
}
