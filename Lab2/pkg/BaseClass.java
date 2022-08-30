package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	
	public BaseClass()
	{
	}
	
	public void randomize(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random()*200001);
		}
	}

	public boolean search(int[] array)
	{
		int num = (int)(Math.random()*200001);
		for (int i = 0; i < array.length; i++)
		{
			if (num == array[i])
			{
				return true;
			}
		}
		return false;
	}
	
	public void bubble(int[] array)
	{
        int store = 0;  
        for(int i = 0; i < array.length; i++)
		{
			for(int j = 1; j < array.length-i; j++)
			{				
				if(array[j-1] > array[j])
				{
                    store = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = store;  
				}
			}
		}
	}
	
	public void insertion(int[] array)
	{
        for (int i = 1; i < array.length; i++)
		{
            int store = array[i];  
            int c = i-1;  
            while ((c > -1) && (array[c] > store))
			{				
                array[c+1] = array[c];  
                c--;  
            }  
            array[c+1] = store;
		}
	}
	
	public void selection(int[] array)
	{
		for (int i = 0; i < array.length-1; i++)  
        {  
            int store = i;  
            for (int j = i+1; j < array.length; j++)
			{
                if (array[j] < array[store])
				{
					store = j;
                }  
            }
			
            int prev = array[store];   
            array[store] = array[i];  
            array[i] = prev;
		}
	}
}
