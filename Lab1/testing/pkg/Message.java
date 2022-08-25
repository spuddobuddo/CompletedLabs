package pkg;
import java.util.*;
import java.io.*;

public class Message {
	
	private String subject;
	private String body;
	private int id;
	private String author;
	private ArrayList<Message> childList;

	// Default Constructor
	public Message() {
		author = "";
		subject = "";
		body = "";
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		author = auth;
		subject = subj;
		body = bod;
		id = i;
		childList = new ArrayList<Message>();
		
	}

	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its childList, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. (add indentation by 2 each recursion)
	public void print(int indentation){
		for (int c = 0; c < indentation*2; c++)
		{
			System.out.print(" ");
		}
		
		System.out.println("Message #"+id+": "+subject);
		for (int c = 0; c < indentation*2; c++)
		{
			System.out.print(" ");
		}
		System.out.println("From "+author+": "+body);

		for (int i = 0; i < childList.size(); i++)
		{
			childList.get(i).print(indentation+1);
		}
		return;
	}

	// Default function for inheritance
	public boolean isReply(){
		return false;
	}

	// Returns the subject String
	public String getSubject(){
		return subject;
	} 

	// Returns the ID
	public int getId(){
		return id;
		
	}

	// Adds a child pointer to the parent's childList. (adds child (reply) to arraylist)
	public void addChild(Message child){
		childList.add(child);
	}

}