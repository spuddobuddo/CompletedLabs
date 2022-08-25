package pkg;
import java.util.*;
import java.io.*;

public class Topic extends Message {
	
	private String subject;
	private String body;
	private int id;
	private String author;
	private ArrayList<Message> childList;
	
	// Default Constructor
	public Topic() {
		author = "";
		subject = "";
		body = "";
	}

	// Parameterized constructor
	public Topic(String auth, String subj, String bod, int i) {
		author = auth;
		subject = subj;
		body = bod;
		id = i;
		childList = new ArrayList<Message>();
	}

	// Returns if it's a reply (false)
	public boolean isReply(){
		return false;
	}
}
