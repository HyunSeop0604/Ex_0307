package ex1_single_array;

public class Ex3_array 
{
	public static void main(String[] args) 
	{
		//
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		//배열의 존재하지 않는 index에 접근하는 것은 불가능
//		arr[3] = 13;
		
		//개선된 루프(for)
		//단전 : 배열의 각 인덱스에 대한 제어가 불가
		for(int index : arr)
		{
			System.out.println(index);
		}//for
		
	}//main
}
