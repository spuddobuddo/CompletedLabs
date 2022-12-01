import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		for (int i = 0; i < 20; i++)
		{
			list.insert(0, (int)(Math.random()*20)+1);
		}
		System.out.println("Part 1:");
		list.printList();
		System.out.println();
		
		for (int i = 0; i < 20; i++)
		{
			list.insert((int)(Math.random()*20), -1);
		}
		System.out.println("Part 2:");
		list.printList();
		System.out.println();
		
		int c = 39;
		for (int i = 0; i < 20; i++)
		{
			list.swap(i, c);
			c--;
		}
		
		System.out.println("Part 3:");
		list.printList();
		System.out.println();
	}
}
