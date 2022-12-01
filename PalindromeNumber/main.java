import java.util.*;

class main{
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int ex = scan.nextInt();
		
		double dex = ex;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int bruh = 0;
		if (ex >= 1)
		{
			while (ex > 0)
			{
				bruh = ex%10;
				ex = ex/10;
				//System.out.println(bruh);
				list.add(bruh);
			}
			//System.out.println("done");
		
			double total = 0;
			int c = 0;
			for (int i = list.size()-1; i >= 0; i--)
			{
				total += list.get(i)*(Math.pow(10, c));
				c++;
				//System.out.println(total);
			}
			//System.out.println("done");
			System.out.println(dex == total);
		}
		else
		{
			boolean bool = false;
			System.out.println(bool);
		}
			
		
	}
}