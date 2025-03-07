package ex1_single_array;

public class Ex5_array 
{
	public static void main(String[] args) 
	{
		
		//배열 nArr 담긴 모든 값의 합을 출력
		int[] nArr = {11,7,21,14,9};
		int sum=0;
		for(int i = 0 ;i<nArr.length;i++)
		{
			sum+=nArr[i];
		}
		System.out.print("결과: "+sum);
		
		System.out.println();
		
		int res=0;
		for(int n : nArr)
		{
			res+=n;
		}
		System.out.print("결과: "+res);
	}//main
}
