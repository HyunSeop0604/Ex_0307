package ex1_single_array;

public class Ex1_single_array 
{
	public static void main(String[] args) 
	{
		//배열은 같은 자료형끼지 모다둔 묶음 이다
		//효율적인 자료관리를 위해 '반드시' 알아둬야 한다
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) 배열 선언
		
		int[] arr;
		
		//2) 배열 생성
		arr = new int[4];
		
		//3) 초기화
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("arr"+"["+i+"] = "+arr[i]);
		}//for
		
	}//main
}
