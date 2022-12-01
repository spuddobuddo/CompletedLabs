import java.util.*;

class main{
	public static void main(String args[]) {
		
		int n = 8;
		String[] parList = new String[n];
		String control = "";
		
		for (int i = 0; i < n; i++)
		{
			if (i<n/2)
			{
				parList.add("(");
			}
			else
			{
				parList.add(")");
			}
			control += parList.get(i);
		}
		
		int c = 1;
		ArrayList<String> totList = new ArrayList<String>();
		
		while (control.indexOf(")") != c)
		{
			int ind = control.indexOf(")");
			System.out.println(ind);
			parList = 
			String set = "";
			
			for (int i = 0; i < parList.size(); i++)
			{
				set += parList.get(i);
			}
			System.out.println(set);
			totList.add(set);
		} 
		
		for (int i = 0; i < totList.size(); i++)
		{
			System.out.print(totList.get(i));
		}
			
		
		
		
		//return string array
	}
	
	/*
	((()))
	(()())
	()(())
	()()()
	(())()
	
	(((())))
	((()()))
	(()(()))
	()((()))
	new control
	
	()(()())
	()()(())
	new control
	
	()()()()
	new control
	
	()(())()
	
	(((())))
	(((()))
	*/
}

