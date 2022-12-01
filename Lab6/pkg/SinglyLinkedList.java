package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;
	
	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList(){
		
	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		
		if (pos == 0)
		{
			return head.getData();
		}
		Node next = head;
		int x = 0;
		while (true)
		{
			if (next == null)
			{
				return -1;
			}
			if (x == pos)
			{
				return next.getData();
			}
			next = next.getNext();
			x++;
		}
		
	}


	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos, int data){
		
		Node newNode = new Node(data);
		if (head == null)
		{
			head = newNode;
			return;
		}
		
		if (pos == 0)
		{
			newNode.setNext(head);
			head = newNode;
		}
		Node next = head;
		int x = 0;
		while (true)
		{
			if (next == null)
			{
				return;
			}
			if (x == pos-1)
			{
				newNode.setNext(next.getNext());
				next.setNext(newNode);
				return;
			}
			next = next.getNext();
			x++;
		}
		
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){
		
		if (pos == 0)
		{
			head = head.getNext();
			return;
		}
		Node next = head;
		int x = 0;
		while (true)
		{
			if (next == null)
			{
				return;
			}
			if (x == pos-1)
			{
				next.setNext(next.getNext().getNext());
				return;
			}
			next = next.getNext();
			x++;
		}
	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){
		
		int save1 = get(pos1);
		int save2 = get(pos2);
		System.out.println(save1+" "+save2);
		
		insert(pos1, save2);
		remove(pos1+1);
		
		insert(pos2, save1);
		remove(pos2+1);
		
	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){
		
		Node next = head.getNext();
		int i = 1;
		System.out.println("Pos:"+0+"| Data:"+head.getData());
		while (next != null)
		{
			System.out.println("Pos:"+i+"| Data:"+next.getData());
			next = next.getNext();
			i++;
		}
		
	}
}
		