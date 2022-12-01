class starter{
	public static void main(String args[]) {
		
		int[] arr = {100, -250, 0, 500};
		// for (int i = 0; i < arr.length; i++)
		// {
			// arr[i] = i+1;
		// }
		
		int z = 0;
		int j = 0;
		int[] multi = new int[arr.length^2];
		int[] prod = new int[arr.length];
		for (int i = 0; i < arr.length^2; i++)
		{
			if (i%arr.length != j)
			{
				multi[i] *= arr[j];
				j++;
			}
			if (i%arr.length)
			{
				prod[z] = 
				j = 0;
				z++;
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(prod[i]);
		}
	}
}