package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {
	
	private String subject;
	private String body;
	private int id;
	private String author;
	private ArrayList<Message> childList;

	// Default Constructor
	public Reply() {
		author = "";
		subject = "";
		body = "";
	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		author = auth;
		subject = subj;
		body = bod;
		id = i;
		childList = new ArrayList<Message>();
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
