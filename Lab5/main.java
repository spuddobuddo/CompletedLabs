import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		/*
			Create an ArrayList of 100 Nodes
			Store random integers in each of them
			Print out all of the values
		*/
		ArrayList<Node> list = new ArrayList<Node>();
		
		for (int i = 0; i < 100; i++)
		{
			Node bruh = new Node((int)(Math.random()*100));
			list.add(bruh);
		}
		
		for (int i = 0; i < 100; i++)
		{
			System.out.println(list.get(i).getData());
		}
		
		
		

	}
}
