package work;

import java.util.Random;

public class Ex2_homework {
    public static void main(String[] args) 
    {
        int[] lotto = new int[6];
        Random R = new Random();  // Random 객체를 한 번만 생성

        for(int i = 0 ; i<lotto.length;i++)
        {
        	lotto[i] = R.nextInt(45)+1;
        	
        	for(int j = 0; j<i;j++)
        	{
        		if(lotto[i]==lotto[j])
        		{
        			i--;
        			break;
        		}
        	}//inner
        }//outer
        
        //오름차순
        for(int i = 0 ;i<lotto.length; i++)
        {
        	for(int j=i+1; j < lotto.length;j++)
        	{
        		if(lotto[i] > lotto[j])
        		{
        			int temp = lotto[i];
        			lotto[i]=lotto[j];
        			lotto[j]=temp;
        		}//if
        	}//inner
        }//outer
        
        for(int arr : lotto) 
        {
            System.out.print(arr + " ");
        }
    }
}